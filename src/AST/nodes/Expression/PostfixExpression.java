package AST.nodes.Expression;

public class PostfixExpression extends Expression {
    private final Identifier identifier;
    private final String operator; // "++", "--", or null

    public PostfixExpression(Identifier identifier, String operator) {
        this.identifier = identifier;
        this.operator = operator;
    }

    @Override
    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("PostfixExpression\n");

        // Add identifier
        builder.append(indent).append("    Identifier:\n");
        if (identifier != null) {
            builder.append(identifier.toString(indent + "        "));
        } else {
            builder.append(indent).append("        null\n");
        }

        // Add operator
        builder.append(indent).append("    Operator: ");
        if (operator != null) {
            builder.append(operator).append("\n");
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }


}
