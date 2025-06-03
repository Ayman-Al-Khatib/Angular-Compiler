package AST.nodes.Type;

public class ArrayType extends Type {

    public ArrayType(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ArrayType\n");

        // Add name with proper indentation
        builder.append(indent).append("└── Name: ")
                .append(super.name != null ? super.name : "null")
                .append("\n");

        return builder.toString();
    }
}