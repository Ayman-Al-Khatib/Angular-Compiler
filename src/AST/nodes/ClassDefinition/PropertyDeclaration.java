package AST.nodes.ClassDefinition;

import AST.nodes.Expression.Expression;
import AST.nodes.Expression.Identifier;
import AST.nodes.Type.Type;

public class PropertyDeclaration extends ClassMember {
    String staticOrInstance;
    Identifier identifier;
    Type type;
    Expression value;

    public PropertyDeclaration(String staticOrInstance, Identifier identifier, Type type, Expression value) {
        this.staticOrInstance = staticOrInstance;
        this.identifier = identifier;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("PropertyDeclaration\n");

        // Add kind (static or instance) with proper indentation
        builder.append(indent).append("├── Kind: ");
        builder.append(staticOrInstance != null ? staticOrInstance + "\n" : "null\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Name: ");
        if (identifier != null) {
            builder.append("\n").append(identifier.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add type with proper indentation
        builder.append(indent).append("├── Type: ");
        if (type != null) {
            builder.append("\n").append(type.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add value with proper indentation
        builder.append(indent).append("└── Value: ");
        if (value != null) {
            builder.append("\n").append(value.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}