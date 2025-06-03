package AST.nodes.FunctionDefinition;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Identifier;
import AST.nodes.Type.Type;

public class Parameter extends ASTNode {
    Identifier id;
    Type type;

    public Parameter(Identifier id, Type type) {
        this.id = id;
        this.type = type;
    }
    public Type getType() {
        return this.type;
    }
    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("Parameter\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Name: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add type with proper indentation
        builder.append(indent).append("└── Type: ");
        if (type != null) {
            builder.append("\n").append(type.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}