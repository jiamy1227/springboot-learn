package org.jiamy;

import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParser.Config;

import java.util.*;

public class SqlLineageParser {
    // Data model for a table
    static class TableNode {
        String tableName;
        List<String> columns;

        TableNode(String tableName) {
            this.tableName = tableName;
            this.columns = new ArrayList<>();
        }
    }

    // Data model for lineage
    static class LineageEdge {
        String sourceTable;
        String targetTable;

        LineageEdge(String sourceTable, String targetTable) {
            this.sourceTable = sourceTable;
            this.targetTable = targetTable;
        }
    }

    // Method to parse SQL and extract lineage
    public static void parseSql(String sql) throws SqlParseException {
        // Configure the SQL parser
        Config config = SqlParser.configBuilder().build();
        SqlParser parser = SqlParser.create(sql, config);

        SqlNode sqlNode = parser.parseStmt();

        // Process the SQLNode to extract lineage
        if (sqlNode.toString().contains("CREATE TABLE")) {
            System.out.println("Found CREATE TABLE: " + sqlNode);
        } else if (sqlNode.toString().contains("INSERT INTO")) {
            System.out.println("Found INSERT INTO: " + sqlNode);
        } else {
            System.out.println("Unhandled SQL type: " + sqlNode.getKind());
        }
    }

    public static void main(String[] args) throws SqlParseException {
        String sql = "insert into print_table select source_table.f0,source_table.f1,source_table2.f2,password from source_table, source_table2";

        parseSql(sql);
    }
}
