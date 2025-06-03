package SymbolTables;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private static Map<String, SymbolInfo> symbolTable = new HashMap<>();

    public static void addSymbol(String name, String type, String scope, String value) {
        symbolTable.put(name, new SymbolInfo(type, scope, value));
    }

    public static void printSymbolTable() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BOLD = "\u001B[1m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_MAGENTA = "\u001B[35m";
        final String ANSI_RED = "\u001B[31m";

        System.out.println(ANSI_BOLD + ANSI_BLUE + "Symbol Table:" + ANSI_RESET);
        System.out.printf(
                ANSI_CYAN + "%-30s%-25s%-30s%-35s\n",
                "Identifier", "Type", "Scope", "Value"
        );
        System.out.println(ANSI_CYAN + "-".repeat(120) + ANSI_RESET); // Adjusted width for columns

        for (Map.Entry<String, SymbolInfo> entry : symbolTable.entrySet()) {
            String identifier = entry.getKey();
            SymbolInfo symbolInfo = entry.getValue();

            String type = symbolInfo.getType();
            String scope = symbolInfo.getScope();
            String value = symbolInfo.getValue();

            System.out.printf(
                    ANSI_GREEN + "%-30s" +
                            ANSI_YELLOW + "%-25s" +
                            ANSI_MAGENTA + "%-30s" +
                            ANSI_RED + "%-35s\n",
                    identifier, type, scope, value
            );
        }
    }

    private static class SymbolInfo {
        private String type;
        private String scope;
        private String value;
        public SymbolInfo(String type, String scope, String value) {
            this.type = type;
            this.scope = scope;
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public String getScope() {
            return scope;
        }

        public String getValue() {
            return value;
        }
    }
}
