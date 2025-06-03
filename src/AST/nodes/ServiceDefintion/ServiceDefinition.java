package AST.nodes.ServiceDefintion;

import AST.nodes.ClassDefinition.ClassDefinition;
import AST.nodes.Statement;

public class ServiceDefinition extends Statement {
    ServiceDecorator decorator;
    ClassDefinition classDefinition;

    public ServiceDefinition(ServiceDecorator decorator, ClassDefinition classDefinition) {
        this.decorator = decorator;
        this.classDefinition = classDefinition;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ServiceDefinition\n");

        // Add decorator with proper indentation
        builder.append(indent).append("├── Decorator: ");
        if (decorator != null) {
            builder.append("\n").append(decorator.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add class definition with proper indentation
        builder.append(indent).append("└── ClassDefinition: ");
        if (classDefinition != null) {
            builder.append("\n").append(classDefinition.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}