package AST.nodes.Expression;

public class Parenthesized extends Expression {
    Expression exp;

    public Parenthesized(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("Parenthesized\n");

        // Add expression with proper indentation
        builder.append(indent).append("└── Expression: ");
        if (exp != null) {
            builder.append("\n").append(exp.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}