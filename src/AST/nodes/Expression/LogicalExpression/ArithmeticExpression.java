package AST.nodes.Expression.LogicalExpression;

import AST.nodes.Expression.Expression;
import java.util.HashMap;
import java.util.Map;

public class ArithmeticExpression extends Expression {
    Map<String, Term> terms;

    public ArithmeticExpression() {
        this.terms = new HashMap<>();
    }

    public void addTerm(String sign, Term term) {
        this.terms.put(sign, term);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ArithmeticExpression\n");

        // Add Terms section
        builder.append(indent).append("├── Terms:\n");
        if (terms != null && !terms.isEmpty()) {
            int i = 0;
            int size = terms.size();
            for (Map.Entry<String, Term> entry : terms.entrySet()) {
                boolean isLast = (++i == size);
                String termIndent = indent + "    ";
                String subIndent = termIndent + "    ";

                builder.append(termIndent).append(isLast ? "└── " : "├── ").append("Term:\n");

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
            builder.append(indent).append("    └── []\n");
        }

        return builder.toString();
    }


}