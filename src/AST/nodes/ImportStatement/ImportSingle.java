package AST.nodes.ImportStatement;

import AST.nodes.Expression.Identifier;

public class ImportSingle extends ImportStatement {
    Identifier id;

    public ImportSingle(String url, Identifier id) {
        super(url);
        this.id = id;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ImportSingle\n");

        // Add URL with proper indentation
        builder.append(indent).append("├── URL: ")
                .append(super.url != null ? super.url : "null")
                .append("\n");

        // Add identifier with proper indentation
        builder.append(indent).append("└── Identifier: ");
        if (id != null) {
            builder.append(id.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}