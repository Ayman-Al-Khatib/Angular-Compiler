package AST.nodes.ClassDefinition;

import AST.nodes.FunctionDefinition.FunctionBody;
import AST.nodes.FunctionDefinition.ParameterList;

public class ConstructorDefinition extends ClassMember {
    FunctionBody functionBody;
    ParameterList parameterList;

    public ConstructorDefinition(FunctionBody functionBody, ParameterList parameterList) {
        this.functionBody = functionBody;
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ConstructorDefinition\n");

        // Add parameter list with proper indentation
        builder.append(indent).append("├── Parameters: ");
        if (parameterList != null) {
            builder.append("\n").append(parameterList.toString(indent + "    "));
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