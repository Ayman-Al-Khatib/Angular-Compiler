package SymbolTables;

import java.util.ArrayList;
import java.util.List;

public class FunctionSymbolTable {
    public static List<FunctionSymbolEntry> symbols = new ArrayList<>();

    public static void addFunction(String name, String type, String scope, String kind, List<String> paramTypes) {
        symbols.add(new FunctionSymbolEntry(name, type, scope, kind, paramTypes));
    }

    public static FunctionSymbolEntry lookup(String name) {
        for (FunctionSymbolEntry entry : symbols) {
            if (entry.name.equals(name) && entry.kind.equals("function-body")) {
                return entry;
            }
        }
        return null;
    }

    public static class FunctionSymbolEntry {
        public String name;
        public String type;
        public String scope;
        public String kind;
        public List<String> paramTypes;

        public FunctionSymbolEntry(String name, String type, String scope, String kind, List<String> paramTypes) {
            this.name = name;
            this.type = type;
            this.scope = scope;
            this.kind = kind;
            this.paramTypes = paramTypes;
        }
    }

}
