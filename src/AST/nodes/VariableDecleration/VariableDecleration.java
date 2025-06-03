package AST.nodes.VariableDecleration;

import AST.nodes.Expression.Expression;
import AST.nodes.Expression.Identifier;
import AST.nodes.Statement;
import AST.nodes.Type.Type;

public class VariableDecleration extends Statement {
    String accessModifier;
    Identifier id;
    Type type; // can be null
    Expression exp;

    public VariableDecleration(String accessModifier, Identifier id, Type type, Expression exp) {
        this.accessModifier = accessModifier;
        this.id = id;
        this.type = type; // can be null
        this.exp = exp;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("VariableDecleration\n");

        // Add access modifier with proper indentation
        builder.append(indent).append("├── AccessModifier: ")
                .append(accessModifier != null ? accessModifier : "null")
                .append("\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Identifier: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add type with proper indentation
        builder.append(indent).append("├── Type: ");
        if (type != null) {
            builder.append("\n").append(type.toString(indent + "    "));
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