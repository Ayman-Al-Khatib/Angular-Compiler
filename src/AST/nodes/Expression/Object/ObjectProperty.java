package AST.nodes.Expression.Object;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Expression;
import AST.nodes.Expression.Identifier;

public class ObjectProperty extends ASTNode {
    Identifier name;
    Expression value;

    public ObjectProperty(Identifier name, Expression value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ObjectProperty\n");

        // Add key (name) with proper indentation
        builder.append(indent).append("├── Key: ");
        if (name != null) {
            builder.append("\n").append(name.toString(indent + "    "));
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