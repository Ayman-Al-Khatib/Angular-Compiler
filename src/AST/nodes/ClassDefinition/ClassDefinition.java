package AST.nodes.ClassDefinition;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Identifier;

public class ClassDefinition extends ASTNode {
    Identifier id;
    ClassBody body;

    public ClassDefinition(Identifier id, ClassBody body) {
        this.id = id;
        this.body = body;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ClassDefinition\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Name: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add class body with proper indentation
        builder.append(indent).append("└── Body: ");
        if (body != null) {
            builder.append("\n").append(body.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}