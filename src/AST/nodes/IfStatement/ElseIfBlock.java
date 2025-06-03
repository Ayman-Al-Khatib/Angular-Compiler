package AST.nodes.IfStatement;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Expression;
import AST.nodes.Statement;

public class ElseIfBlock extends ASTNode {
    Expression condition;
    Statement statement;

    public ElseIfBlock(Expression condition, Statement statement) {
        this.condition = condition;
        this.statement = statement;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ElseIfBlock\n");

        // Add condition with proper indentation
        builder.append(indent).append("├── Condition: ");
        if (condition != null) {
            builder.append("\n").append(condition.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

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