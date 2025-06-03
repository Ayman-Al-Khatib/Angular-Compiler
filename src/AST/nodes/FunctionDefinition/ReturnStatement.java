package AST.nodes.FunctionDefinition;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Expression;

public class ReturnStatement extends ASTNode {
    Expression exp;

    public ReturnStatement(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ReturnStatement\n");

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