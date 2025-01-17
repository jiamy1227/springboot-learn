package org.jiamy;

import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.util.SqlVisitor;
import org.apache.calcite.sql.util.SqlBasicVisitor;
import org.apache.flink.sql.parser.ddl.SqlCreateTable;
import org.apache.flink.sql.parser.ddl.SqlTableColumn;
import org.apache.flink.sql.parser.impl.FlinkSqlParserImpl;

import java.util.*;

public class FlinkSqlParserExample {

    public static void main(String[] args) throws Exception {
        // 输入的 Flink SQL
        String sql ="  CREATE TABLE source_table (\n" +
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
                " \n" +
                "   CREATE TABLE source_table2 (\n" +
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
                "  \n" +
                "  \n" +
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
                " \n" +
                " \n" +
                "  \n" +
                "  \n" +
                "  insert into print_table select source_table.f0,source_table2.f1,source_table.f2,source_table2.password from source_table, source_table2;\n";

        // 解析 SQL 并提取映射关系
        Map<String, List<String>> tableSchemas = extractTableSchemas(sql);
        Map<String, String> fieldMappings = extractFieldMappings(sql);

        // 输出表与字段映射关系
        System.out.println("表与字段映射关系:");
        System.out.println("表结构: " + tableSchemas);
        System.out.println("字段映射: " + fieldMappings);
    }

    // 提取表结构 (字段定义)
    public static Map<String, List<String>> extractTableSchemas(String sql) throws Exception {
        SqlParser parser = SqlParser.create(sql, SqlParser.configBuilder()
                .setParserFactory(FlinkSqlParserImpl.FACTORY)
                .build());
        SqlNodeList nodes = (SqlNodeList) parser.parseStmtList();

        Map<String, List<String>> tableSchemas = new HashMap<>();

        for (SqlNode node : nodes) {
            if (node instanceof SqlCreateTable) {
                SqlCreateTable createTable = (SqlCreateTable) node;
                String tableName = createTable.getTableName().toString();
                SqlNodeList columnList = createTable.getColumnList();

                List<String> columns = new ArrayList<>();
                for (SqlNode columnNode : columnList) {
                    if (columnNode instanceof SqlTableColumn) {
                        SqlTableColumn column = (SqlTableColumn) columnNode;
                        columns.add(column.getName().toString());
                    }
                }
                tableSchemas.put(tableName, columns);
            }
        }

        return tableSchemas;
    }

    // 提取字段映射关系
    public static Map<String, String> extractFieldMappings(String sql) throws Exception {
        SqlParser parser = SqlParser.create(sql, SqlParser.configBuilder()
                .setParserFactory(FlinkSqlParserImpl.FACTORY)
                .build());
        SqlNodeList nodes = (SqlNodeList) parser.parseStmtList();

        Map<String, String> fieldMappings = new HashMap<>();

        for (SqlNode node : nodes) {
            if (node instanceof SqlInsert) {
                SqlInsert insert = (SqlInsert) node;
                SqlNode targetTable = insert.getTargetTable();
                SqlNode sourceSelect = insert.getSource();

                if (sourceSelect instanceof SqlSelect) {
                    SqlSelect select = (SqlSelect) sourceSelect;
                    SqlNodeList selectList = select.getSelectList();

                    for (int i = 0; i < selectList.size(); i++) {
                        SqlNode field = selectList.get(i);
                        String sourceField = field.toString();
                        String targetField = field.toString(); // 可以进一步解析别名

                        fieldMappings.put(sourceField, targetField);
                    }
                }
            }
        }

        return fieldMappings;
    }
}
