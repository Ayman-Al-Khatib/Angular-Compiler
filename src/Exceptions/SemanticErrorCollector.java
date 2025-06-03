package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class SemanticErrorCollector {
    private static final List<String> errors = new ArrayList<>();

    public static void add(String error) {
        errors.add(error);
    }

    public static List<String> getErrors() {
        return errors;
    }

    public static boolean hasErrors() {
        return !errors.isEmpty();
    }

    public static void clear() {
        errors.clear();
    }
}
