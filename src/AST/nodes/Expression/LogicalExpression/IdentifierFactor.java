package AST.nodes.Expression.LogicalExpression;

import AST.nodes.Expression.Identifier;

public class IdentifierFactor extends Factor {
    private Identifier id;

    public IdentifierFactor(Identifier id) {
        this.id = id;
    }

    // Getter for Identifier
    public Identifier getId() {
        return id;
    }

    // Setter for Identifier (optional, if you want mutability)
    public void setId(Identifier id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("IdentifierFactor\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Identifier: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}