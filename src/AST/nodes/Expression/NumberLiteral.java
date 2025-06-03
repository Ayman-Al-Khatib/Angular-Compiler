package AST.nodes.Expression;

public class NumberLiteral extends Expression {
    String literal;

    public NumberLiteral(String literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("NumberLiteral\n");

        // Add number value with proper indentation
        builder.append(indent).append("└── value: ");
        if (literal != null) {
            builder.append(literal).append("\n");
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}