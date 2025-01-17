package org.jiamy.parsesql;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.flink.sql.parser.ddl.SqlCreateTable;
import org.apache.flink.sql.parser.ddl.SqlTableColumn;
import org.apache.flink.sql.parser.ddl.SqlTableOption;
import org.apache.flink.sql.parser.impl.FlinkSqlParserImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlinkSqlParserExample {

    private static HashMap<String, TableModel> tableModelMap = new HashMap<>();

    private static List<FieldMapping> fieldMappings = new ArrayList<>();

    public static void main(String[] args) throws SqlParseException {
        // SQL语句
        String sql = "CREATE TABLE source_table (\n" +
                "  id STRING,\n" +
                "  f0 STRING,\n" +
                "  f1 STRING,\n" +
                "  f2 STRING,\n" +
                "  password STRING\n" +
                " ) WITH (\n" +
                "  'connector' = 'jdbc',\n" +
                "  'url' = 'jdbc:mysql://172.17.13.55:3306/data_cloud_uat?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8',\n" +
                "  'table-name' = 'source_table',\n" +
                "  'username' = 'root',\n" +
                "  'password' = '123456'\n" +
                " );\n" +
                "CREATE TABLE source_table2 (\n" +
                "  id STRING,\n" +
                "  f0 STRING,\n" +
                "  f1 STRING,\n" +
                "  f2 STRING,\n" +
                "  password STRING\n" +
                " ) WITH (\n" +
                "  'connector' = 'jdbc',\n" +
                "  'url' = 'jdbc:mysql://172.17.13.55:3306/data_cloud_uat?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8',\n" +
                "  'table-name' = 'source_table2',\n" +
                "  'username' = 'root',\n" +
                "  'password' = '123456'\n" +
                " );\n" +
                " CREATE TABLE print_table (\n" +
                "  f0 STRING,\n" +
                "  f1 STRING,\n" +
                "  f2 STRING,\n" +
                "  password STRING\n" +
                " ) WITH (\n" +
                "  'connector' = 'jdbc',\n" +
                "  'url' = 'jdbc:mysql://172.17.13.55:3306/data_cloud_uat?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8',\n" +
                "  'table-name' = 'print_table',\n" +
                "  'username' = 'root',\n" +
                "  'password' = '123456'\n" +
                " );\n" +
                "insert into print_table select source_table.f0,source_table2.f1,source_table.f2,source_table2.password from source_table left join source_table2 on source_table.id=source_table2.id;";

        // 初始化 SQL 解析器
        SqlParser parser = SqlParser.create(sql, SqlParser.configBuilder()
                .setParserFactory(FlinkSqlParserImpl.FACTORY)
                .build());
        SqlNodeList nodes = parser.parseStmtList();

        // 逐条解析 SQL
        for(SqlNode node : nodes) {
            // 进一步解析和分析 AST
            processSqlNode(node);
        }

        // 输出
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonString = objectMapper.writeValueAsString(tableModelMap);
            String jsonString2 = objectMapper.writeValueAsString(fieldMappings);
            System.out.println("表信息：");
            System.out.println(jsonString);
            System.out.println("字段映射信息：");
            System.out.println(jsonString2);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    private static void processSqlNode(SqlNode node) {
        // 针对不同类型的 SQL 语句进行分类处理
        switch (node.getKind()) {
            case CREATE_TABLE:
                // 构建表和字段关联关系模型
                processCreateTable(node);
                break;
            case INSERT:
                // 构建字段之间的映射关系
                processInsertInto(node);
                break;
        }
    }

    public static void processInsertInto(SqlNode node) {
        if (!(node instanceof SqlInsert)) {
            throw new IllegalArgumentException("Expected SqlInsert node");
        }
        SqlInsert insert = (SqlInsert) node;
        // 获取目标表名称
        String targetTable = insert.getTargetTable().toString();
        // 获取 SELECT 子句
        SqlSelect select = (SqlSelect) insert.getSource();

        SqlNodeList selectList = select.getSelectList();
        if (selectList != null) {
            for (SqlNode selectItem : selectList) {
                FieldMapping fieldMapping = new FieldMapping();
                if (selectItem instanceof SqlIdentifier) {
                    // 直接映射的字段
                    String sourceTable = ((SqlIdentifier) selectItem).names.get(0);
                    String sourceField = ((SqlIdentifier) selectItem).names.get(1);
                    fieldMapping.setSourceTable(sourceTable);
                    fieldMapping.setSourceField(sourceField);
                    fieldMapping.setTargetField(sourceField);
                } else if (selectItem instanceof SqlBasicCall) {
                    // 处理别名映射（如 f0 AS field1）
                    SqlBasicCall aliasCall = (SqlBasicCall) selectItem;
                    if (aliasCall.getKind() == SqlKind.AS) {
                        String sourceField = aliasCall.operand(0).toString();
                        String targetField = aliasCall.operand(1).toString();
                        fieldMapping.setSourceField(sourceField);
                        fieldMapping.setSourceField(targetField);
                    }
                }
                fieldMapping.setTargetTable(targetTable);
                fieldMappings.add(fieldMapping);
            }
        }
    }

    public static void processCreateTable(SqlNode node) {
        if (!(node instanceof SqlCreateTable)) {
            throw new IllegalArgumentException("Expected SqlCreateTable node");
        }

        SqlCreateTable createTable = (SqlCreateTable) node;

        // 提取表名
        String tableName = createTable.getTableName().toString();

        // 提取字段列表
        List<String> fieldNames = new ArrayList<>();
        Map<String, String> fieldTypes = new HashMap<>();

        SqlNodeList columnList = createTable.getColumnList();
        if (columnList != null) {
            for (SqlNode columnNode : columnList) {
                if (columnNode instanceof SqlTableColumn.SqlRegularColumn) {
                    SqlTableColumn.SqlRegularColumn column = (SqlTableColumn.SqlRegularColumn) columnNode;
                    String columnName = column.getName().toString();
                    String columnType = column.getType().toString();
                    fieldNames.add(columnName);
                    fieldTypes.put(columnName, columnType);
                }
            }
        }

        // 提取元数据 (WITH 子句中的配置项)
        Map<String, String> metadata = new HashMap<>();
        SqlNodeList propertyList = createTable.getPropertyList();
        if (propertyList != null) {
            for (SqlNode propertyNode : propertyList) {
                if (propertyNode instanceof SqlTableOption) {
                    SqlTableOption option = (SqlTableOption) propertyNode;
                    String key = option.getKeyString();
                    String value = option.getValueString();
                    metadata.put(key, value);
                }
            }
        }

        // 构建表模型
        TableModel tableModel = new TableModel(tableName, fieldNames, fieldTypes, metadata);
        tableModelMap.put(tableName, tableModel);
    }
}
