package AST.nodes.ComponentDefinition;

import AST.nodes.Expression.StringLiteral;
import AST.nodes.StringArray;
import AST.nodes.ASTNode;

public class ComponentDecorator extends ASTNode {
    StringLiteral selector;
    StringLiteral templateUrl;
    StringArray styleUrls;

    public ComponentDecorator(StringLiteral selector, StringLiteral templateUrl, StringArray styleUrls) {
        this.selector = selector;
        this.templateUrl = templateUrl;
        this.styleUrls = styleUrls;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ComponentDecorator\n");

        // Add selector with proper indentation
        builder.append(indent).append("├── Selector: ");
        if (selector != null) {
            builder.append("\n").append(selector.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add templateUrl with proper indentation
        builder.append(indent).append("├── TemplateUrl: ");
        if (templateUrl != null) {
            builder.append("\n").append(templateUrl.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add styleUrls with proper indentation
        builder.append(indent).append("└── StyleUrls: ");
        if (styleUrls != null) {
            builder.append("\n").append(styleUrls.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}