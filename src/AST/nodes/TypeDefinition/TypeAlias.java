package AST.nodes.TypeDefinition;

import AST.nodes.Expression.Identifier;

public class TypeAlias extends TypeDefinition {
    Identifier id;
    TypeBody body;

    public TypeAlias(Identifier id, TypeBody body) {
        this.id = id;
        this.body = body;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("TypeAlias\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Identifier: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add body with proper indentation
        builder.append(indent).append("└── Body: ");
        if (body != null) {
            builder.append("\n").append(body.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}