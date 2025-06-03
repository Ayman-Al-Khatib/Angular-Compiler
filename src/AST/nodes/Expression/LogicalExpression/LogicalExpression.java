package AST.nodes.Expression.LogicalExpression;

import AST.nodes.Expression.Expression;
import java.util.HashMap;
import java.util.Map;

public class LogicalExpression extends Expression {
    Map<String, ArithmeticExpression> expressions;

    public LogicalExpression() {
        this.expressions = new HashMap<>();
    }

    public void addArithmeticExpression(String logicalOperation, ArithmeticExpression arithmeticExpression) {
        this.expressions.put(logicalOperation, arithmeticExpression);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("LogicalExpression\n");

        // Handle expressions map with proper indentation
        builder.append(indent).append("├── Expressions:\n");
        if (expressions != null && !expressions.isEmpty()) {
            for (Map.Entry<String, ArithmeticExpression> entry : expressions.entrySet()) {
                builder.append(indent).append("    ├── Expression:\n");

                // Add logical operation with proper indentation
                builder.append(indent).append("        ├── Operation: ");
                builder.append(entry.getKey() != null ? entry.getKey() + "\n" : "null\n");

                // Add arithmetic expression with proper indentation
                builder.append(indent).append("        └── Value:\n");
                if (entry.getValue() != null) {
                    builder.append(entry.getValue().toString(indent + "            "));
                } else {
                    builder.append(indent).append("            null\n");
                }
            }
        } else {
            builder.append(indent).append("    None\n");
        }

        return builder.toString();
    }

}