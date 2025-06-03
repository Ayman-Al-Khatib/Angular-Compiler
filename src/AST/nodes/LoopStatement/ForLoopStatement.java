package AST.nodes.LoopStatement;

import AST.nodes.Expression.Expression;
import AST.nodes.Statement;
import AST.nodes.VariableDecleration.VariableDecleration;

public class ForLoopStatement extends LoopStatement {
    VariableDecleration forInitializer;
    Expression forCondition;
    Expression forUpdate;
    Statement statement;

    public ForLoopStatement(VariableDecleration forInitializer, Expression forCondition, Expression forUpdate, Statement statement) {
        this.forInitializer = forInitializer;
        this.forCondition = forCondition;
        this.forUpdate = forUpdate;
        this.statement = statement;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ForLoopStatement\n");

        // Add initializer with proper indentation
        builder.append(indent).append("├── Initializer: ");
        if (forInitializer != null) {
            builder.append("\n").append(forInitializer.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add condition with proper indentation
        builder.append(indent).append("├── Condition: ");
        if (forCondition != null) {
            builder.append("\n").append(forCondition.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add update with proper indentation
        builder.append(indent).append("├── Update: ");
        if (forUpdate != null) {
            builder.append("\n").append(forUpdate.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add body statement with proper indentation
        builder.append(indent).append("└── Body: ");
        if (statement != null) {
            builder.append("\n").append(statement.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}