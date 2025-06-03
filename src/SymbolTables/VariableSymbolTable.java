package SymbolTables;
import Exceptions.SemanticErrorCollector;
import Exceptions.SemanticException;

import java.util.*;
import java.util.*;

public class VariableSymbolTable {
    private static final List<Map<String, VariableSymbol>> scopes = new ArrayList<>();

    static {
        enterScope(); // global scope
    }

    public static void enterScope() {
        scopes.add(new HashMap<>());
    }

    public static void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.remove(scopes.size() - 1);
        }
    }

    public static void declareVariable(String name, String type, String value, int line) {
        Map<String, VariableSymbol> currentScope = getCurrentScope();

        if (currentScope.containsKey(name)) {
            SemanticErrorCollector.add(String.format(
                    "Line %d: Duplicate variable declaration: '%s'", line, name));
            return;
        }

        currentScope.put(name, new VariableSymbol(name, type, value));
    }


    public static VariableSymbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, VariableSymbol> scope = scopes.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null;
    }

    public static boolean isDeclaredInCurrentScope(String name) {
        return getCurrentScope().containsKey(name);
    }

    private static Map<String, VariableSymbol> getCurrentScope() {
        if (scopes.isEmpty()) {
            throw new IllegalStateException("No scope available");
        }
        return scopes.get(scopes.size() - 1);
    }

    public static class VariableSymbol {
        private final String name;
        private final String type;
        private final String value;

        public VariableSymbol(String name, String type, String value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

        public String getName() { return name; }
        public String getType() { return type; }
        public String getValue() { return value; }
    }

}
