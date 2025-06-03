package AST.nodes.TypeDefinition;

import AST.nodes.Expression.Identifier;

public class Interface extends TypeDefinition {

    Identifier id;
    InterfaceBody body;

    public Interface(Identifier id, InterfaceBody body) {
        this.id = id;
        this.body = body;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("Interface\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Identifier: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add interface body with proper indentation
        builder.append(indent).append("└── Body: ");
        if (body != null) {
            builder.append("\n").append(body.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}