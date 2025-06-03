package AST.nodes.Expression.FunctionInvocation;

import AST.nodes.FunctionDefinition.FunctionName;
import AST.nodes.Statement;

public class FunctionInvocation extends Statement {
    FunctionName functionName;
    ArgumentList argumentList;

    public FunctionInvocation(FunctionName functionName, ArgumentList argumentList) {
        this.functionName = functionName;
        this.argumentList = argumentList;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("FunctionInvocation\n");

        // Add function name with proper indentation
        builder.append(indent).append("├── Name: ");
        if (functionName != null) {
            builder.append("\n").append(functionName.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add argument list with proper indentation
        builder.append(indent).append("└── Arguments: ");
        if (argumentList != null) {
            builder.append("\n").append(argumentList.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}