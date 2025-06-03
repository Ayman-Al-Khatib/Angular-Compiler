package AST.nodes.Expression.LogicalExpression;

import AST.nodes.Expression.StringLiteral;

public class StringFactor extends Factor {
    private StringLiteral literal;

    public StringFactor(StringLiteral literal) {
        this.literal = literal;
    }

    // Getter for StringLiteral
    public StringLiteral getLiteral() {
        return literal;
    }

    // Setter for StringLiteral (optional, for mutability)
    public void setLiteral(StringLiteral literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("StringFactor\n");

        // Add literal with proper indentation
        builder.append(indent).append("├── Value: ");
        if (literal != null) {
            builder.append("\n").append(literal.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}