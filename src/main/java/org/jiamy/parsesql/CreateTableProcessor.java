package org.jiamy.parsesql;

import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParserPos;
import org.apache.flink.sql.parser.ddl.SqlCreateTable;
import org.apache.flink.sql.parser.ddl.SqlTableColumn;
import org.apache.flink.sql.parser.ddl.SqlTableOption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateTableProcessor {
    public static TableModel processCreateTable(SqlNode node) {
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
        return new TableModel(tableName, fieldNames, fieldTypes, metadata);
    }
}
