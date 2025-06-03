package AST.nodes.FunctionDefinition;

import AST.nodes.Expression.Identifier;
import AST.nodes.Statement;
import AST.nodes.Type.Type;

public class FunctionDefinition extends Statement {
    Identifier id;
    ParameterList parameterList; // can be null
    Type returnType; // can be null
    FunctionBody functionBody; // can be null

    public FunctionDefinition(Identifier id, ParameterList parameterList, Type returnType, FunctionBody functionBody) {
        this.id = id;
        this.parameterList = parameterList;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("FunctionDefinition\n");

        // Add function name with proper indentation
        builder.append(indent).append("├── Name: ");
        if (id != null) {
            builder.append("\n").append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add parameter list with proper indentation
        builder.append(indent).append("├── Parameters: ");
        if (parameterList != null) {
            builder.append("\n").append(parameterList.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add return type with proper indentation
        builder.append(indent).append("├── ReturnType: ");
        if (returnType != null) {
            builder.append("\n").append(returnType.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add function body with proper indentation
        builder.append(indent).append("└── Body: ");
        if (functionBody != null) {
            builder.append("\n").append(functionBody.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}