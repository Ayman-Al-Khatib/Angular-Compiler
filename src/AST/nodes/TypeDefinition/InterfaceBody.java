package AST.nodes.TypeDefinition;

import AST.nodes.ASTNode;
import AST.nodes.Expression.Identifier;
import AST.nodes.Type.Type;
import java.util.HashMap;
import java.util.Map;

public class InterfaceBody extends ASTNode {
    Map<Identifier, Type> ids; // type can be null

    public InterfaceBody() {
        this.ids = new HashMap<>();
    }

    public void addId(Identifier id, Type type) {
        this.ids.put(id, type);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("InterfaceBody\n");

        // Add members with proper indentation
        builder.append(indent).append("├── Members:\n");

        if (ids.isEmpty()) {
            builder.append(indent).append("    []\n");
        } else {
            for (Map.Entry<Identifier, Type> entry : ids.entrySet()) {
                builder.append(indent).append("    ├── Member:\n");

                // Add identifier with proper indentation
                builder.append(indent).append("    │   ├── Name: ");
                if (entry.getKey() != null) {
                    builder.append("\n").append(entry.getKey().toString(indent + "        "));
                } else {
                    builder.append("null\n");
                }

                // Add type with proper indentation
                builder.append(indent).append("    │   └── Type: ");
                if (entry.getValue() != null) {
                    builder.append("\n").append(entry.getValue().toString(indent + "        "));
                } else {
                    builder.append("null\n");
                }
            }
        }

        return builder.toString();
    }
}