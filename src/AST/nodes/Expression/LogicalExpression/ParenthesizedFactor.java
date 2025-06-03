package AST.nodes.Expression.LogicalExpression;

import AST.nodes.Expression.Expression;

public class ParenthesizedFactor extends Factor {
    private Expression expression;

    public ParenthesizedFactor(Expression expression) {
        this.expression = expression;
    }

    // Getter for the expression
    public Expression getExpression() {
        return expression;
    }

    // Setter for the expression (optional, for mutability)
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ParenthesizedFactor\n");

        // Add expression with proper indentation
        builder.append(indent).append("├── Expression: ");
        if (expression != null) {
            builder.append("\n").append(expression.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}