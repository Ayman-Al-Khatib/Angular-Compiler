package AST.nodes.FunctionDefinition;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Identifier;

public class FunctionName extends ASTNode {
    Identifier id;

    public FunctionName(Identifier id) {
        this.id = id;
    }
    public String getBaseName() {
        return this.id.getName();
    }
    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("FunctionName\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Name: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}