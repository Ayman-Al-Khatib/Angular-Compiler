package AST.nodes.AssignmentStatement;

import AST.nodes.Expression.Expression;
import AST.nodes.Expression.Identifier;
import AST.nodes.Statement;

public class AssignmentStatement extends Statement {
    Expression exp;
    Identifier id;

    public AssignmentStatement(Expression exp, Identifier id) {
        this.exp = exp;
        this.id = id;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("AssignmentStatement\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Identifier: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add expression with proper indentation
        builder.append(indent).append("└── Expression: ");
        if (exp != null) {
            builder.append("\n").append(exp.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}