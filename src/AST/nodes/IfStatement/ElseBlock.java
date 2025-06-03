package AST.nodes.IfStatement;

import AST.nodes.ASTNode;
import AST.nodes.Statement;

public class ElseBlock extends ASTNode {
    Statement statement;

    public ElseBlock(Statement statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ElseBlock\n");

        // Add statement with proper indentation
        builder.append(indent).append("└── Statement: ");
        if (statement != null) {
            builder.append("\n").append(statement.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}