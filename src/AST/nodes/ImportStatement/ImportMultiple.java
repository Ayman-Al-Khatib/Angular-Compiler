package AST.nodes.ImportStatement;

import AST.nodes.Expression.Identifier;
import java.util.ArrayList;

public class ImportMultiple extends ImportStatement {
    ArrayList<Identifier> ids;

    public ImportMultiple(String url) {
        super(url);
        this.ids = new ArrayList<>();
    }

    public void addChild(Identifier id) {
        this.ids.add(id);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ImportMultiple\n");

        // Add URL with proper indentation
        builder.append(indent).append("├── URL: ")
                .append(super.url != null ? super.url : "null")
                .append("\n");

        // Add identifiers with tree-like structure
        builder.append(indent).append("└── Identifiers:\n");
        if (ids != null && !ids.isEmpty()) {
            for (int i = 0; i < ids.size(); i++) {
                Identifier id = ids.get(i);
                if (id != null) {
                    builder.append(id.toString(indent + "    "));
                    if (i < ids.size() - 1) {
                        builder.append("\n");
                    }
                } else {
                    builder.append(indent).append("    null\n");
                }
            }
        } else {
            builder.append(indent).append("    None\n");
        }

        return builder.toString();
    }
}