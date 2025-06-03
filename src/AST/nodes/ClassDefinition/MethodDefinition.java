package AST.nodes.ClassDefinition;

import AST.nodes.Expression.Identifier;
import AST.nodes.FunctionDefinition.FunctionBody;
import AST.nodes.FunctionDefinition.ParameterList;
import AST.nodes.Type.Type;

public class MethodDefinition extends ClassMember {
    String staticOrInstance;
    Identifier identifier;
    ParameterList parameterList;
    Type type;
    FunctionBody methodBody;

    public MethodDefinition(String staticOrInstance, Identifier identifier, ParameterList parameterList, Type type, FunctionBody methodBody) {
        this.staticOrInstance = staticOrInstance;
        this.identifier = identifier;
        this.parameterList = parameterList;
        this.type = type;
        this.methodBody = methodBody;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("MethodDefinition\n");

        // Add kind (static or instance) with proper indentation
        builder.append(indent).append("├── Kind: ");
        builder.append(staticOrInstance != null ? staticOrInstance + "\n" : "null\n");

        // Add identifier with proper indentation
        builder.append(indent).append("├── Name: ");
        if (identifier != null) {
            builder.append("\n").append(identifier.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add return type with proper indentation
        builder.append(indent).append("├── ReturnType: ");
        if (type != null) {
            builder.append("\n").append(type.toString(indent + "    "));
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

        // Add method body with proper indentation
        builder.append(indent).append("└── Body: ");
        if (methodBody != null) {
            builder.append("\n").append(methodBody.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}