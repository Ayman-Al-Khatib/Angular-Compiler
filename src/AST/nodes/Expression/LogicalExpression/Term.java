package AST.nodes.Expression.LogicalExpression;

import AST.nodes.ASTNode;
import java.util.HashMap;
import java.util.Map;

public class Term extends ASTNode {
    Map<String, Factor> factors;

    public Term() {
        this.factors = new HashMap<>();
    }

    public void addFactor(String sign, Factor factor) {
        this.factors.put(sign, factor);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();

        builder.append(indent).append("Factors:\n");
        if (factors != null && !factors.isEmpty()) {
            int i = 0;
            int size = factors.size();
            for (Map.Entry<String, Factor> entry : factors.entrySet()) {
                boolean isLast = (++i == size);
                String factorIndent = indent + "    ";
                String subIndent = factorIndent + "    ";

                builder.append(factorIndent).append(isLast ? "└── " : "├── ").append("Factor:\n");

                // Sign
                builder.append(subIndent).append("├── Sign: ");
                builder.append(entry.getKey() != null ? entry.getKey() + "\n" : "null\n");

                // Value
                builder.append(subIndent).append("└── Value:\n");
                if (entry.getValue() != null) {
                    builder.append(entry.getValue().toString(subIndent + "    "));
                } else {
                    builder.append(subIndent).append("    null\n");
                }
            }
        } else {
            builder.append(indent).append("    └── None\n");
        }

        return builder.toString();
    }

}