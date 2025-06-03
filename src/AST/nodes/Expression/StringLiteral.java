package AST.nodes.Expression;

public class StringLiteral extends Expression {
    String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("StringLiteral\n");

        // Add string value with proper indentation, preserving quotes
        builder.append(indent).append("└── value: ");
        if (value != null) {
            builder.append("\"").append(value).append("\"").append("\n");
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}