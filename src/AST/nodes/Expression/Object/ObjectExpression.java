package AST.nodes.Expression.Object;

import AST.nodes.Expression.Expression;
import java.util.ArrayList;

public class ObjectExpression extends Expression {
    ArrayList<ObjectProperty> properties;

    public ObjectExpression() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(ObjectProperty exp) {
        this.properties.add(exp);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ObjectExpression\n");

        // Add properties with proper indentation
        builder.append(indent).append("├── Properties:\n");
        if (properties != null && !properties.isEmpty()) {
            for (ObjectProperty property : properties) {
                if (property != null) {
                    builder.append(property.toString(indent + "    "));
                } else {
                    builder.append(indent).append("    - null\n");
                }
            }
        } else {
            builder.append(indent).append("    []\n");
        }

        return builder.toString();
    }
}