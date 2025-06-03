package AST.nodes.Expression;

import java.util.ArrayList;

public class ArrayExpression extends Expression {
    ArrayList<Expression> exps;

    public ArrayExpression() {
        this.exps = new ArrayList<>();
    }

    public void addExpression(Expression exp) {
        this.exps.add(exp);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ArrayExpression\n");

        // Add elements with proper indentation
        builder.append(indent).append("├── Elements:\n");
        if (exps.isEmpty()) {
            builder.append(indent).append("    []\n");
        } else {
            for (Expression exp : exps) {
                if (exp != null) {
                    builder.append(exp.toString(indent + "    "));
                } else {
                    builder.append(indent).append("    - null\n");
                }
            }
        }

        return builder.toString();
    }
}