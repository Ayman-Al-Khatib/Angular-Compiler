package AST.nodes.Expression.FunctionInvocation;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Expression;
import java.util.ArrayList;

public class ArgumentList extends ASTNode {
    ArrayList<Expression> expressions;

    public ArgumentList() {
        this.expressions = new ArrayList<>();
    }
    public ArrayList<Expression> getExpressions() {
        return this.expressions;
    }
    public void addExp(Expression exp) {
        this.expressions.add(exp);
    }
    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ArgumentList\n");

        // Handle expressions list with proper indentation
        builder.append(indent).append("├── Arguments:\n");
        if (expressions != null && !expressions.isEmpty()) {
            for (Expression exp : expressions) {
                if (exp != null) {
                    builder.append(exp.toString(indent + "    "));
                } else {
                    builder.append(indent).append("    - null\n");
                }
            }
        } else {
            builder.append(indent).append("    []\n");
        }

        return builder.toString();
    }
}