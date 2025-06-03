package AST.nodes.ServiceDefintion;

import AST.nodes.ASTNode;
import AST.nodes.Expression.StringLiteral;

public class ServiceDecorator extends ASTNode {
    StringLiteral providedIn;

    public ServiceDecorator(StringLiteral providedIn) {
        this.providedIn = providedIn;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ServiceDecorator\n");

        // Add providedIn with proper indentation
        builder.append(indent).append("└── ProvidedIn: ");
        if (providedIn != null) {
            builder.append("\n").append(providedIn.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}