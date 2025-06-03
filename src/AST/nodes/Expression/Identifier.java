package AST.nodes.Expression;

public class Identifier extends Expression {
    String id;
    public Identifier(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return toString("");
    }
    public String getName() {
        return this.id;
    }
    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();

        // Add identifier value with proper indentation
        builder.append(indent).append("└── name: ");
        if (id != null) {
            builder.append(id).append("\n");
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}