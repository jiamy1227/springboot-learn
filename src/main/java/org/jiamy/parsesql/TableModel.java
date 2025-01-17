package org.jiamy.parsesql;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TableModel {
    private String tableName;
    private List<String> fields;               // 字段名列表
    private Map<String, String> fieldTypes;    // 字段名 -> 类型
    private Map<String, String> metadata;      // 元数据，如 WITH 子句的内容

    public TableModel(String tableName, List<String> fields, Map<String, String> fieldTypes, Map<String, String> metadata) {
        this.tableName = tableName;
        this.fields = fields;
        this.fieldTypes = fieldTypes;
        this.metadata = metadata;
    }
}
