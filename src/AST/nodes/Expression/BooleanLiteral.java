package AST.nodes.Expression;

public class BooleanLiteral extends Expression {
    Boolean value;

    public BooleanLiteral(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("BooleanLiteral\n");

        // Add boolean value with proper indentation
        builder.append(indent).append("└── value: ");
        if (value != null) {
            builder.append(value).append("\n");
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}
