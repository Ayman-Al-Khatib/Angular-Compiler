package AST.nodes.ComponentDefinition;

import AST.nodes.ClassDefinition.ClassDefinition;
import AST.nodes.Statement;

public class ComponentDefinition extends Statement {
    ComponentDecorator componentDecorator;
    ClassDefinition classDefinition;

    public ComponentDefinition(ComponentDecorator decorator, ClassDefinition classDefinition) {
        this.componentDecorator = decorator;
        this.classDefinition = classDefinition;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ComponentDefinition\n");

        // Add decorator with proper indentation
        builder.append(indent).append("├── Decorator: ");
        if (componentDecorator != null) {
            builder.append("\n").append(componentDecorator.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add class definition with proper indentation
        builder.append(indent).append("└── Class: ");
        if (classDefinition != null) {
            builder.append("\n").append(classDefinition.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}