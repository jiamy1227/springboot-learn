package org.jiamy.parsesql;

import lombok.Data;

@Data
public class FieldMapping {
    private String sourceTable;       // 源表名称
    private String targetTable;       // 目标表名称
    private String sourceField;       // 源字段名称
    private String targetField;       // 目标字段名称
}
