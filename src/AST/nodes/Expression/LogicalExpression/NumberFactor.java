package AST.nodes.Expression.LogicalExpression;

import AST.nodes.Expression.NumberLiteral;

public class NumberFactor extends Factor {
    private NumberLiteral number;

    public NumberFactor(NumberLiteral number) {
        this.number = number;
    }

    // Getter for NumberLiteral
    public NumberLiteral getNumber() {
        return number;
    }

    // Setter for NumberLiteral (optional, for mutability)
    public void setNumber(NumberLiteral number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("NumberFactor\n");

        // Add number with proper indentation
        builder.append(indent).append("├── Number: ");
        if (number != null) {
            builder.append("\n").append(number.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}