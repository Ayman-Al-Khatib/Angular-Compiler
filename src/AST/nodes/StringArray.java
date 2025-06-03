package AST.nodes;

import AST.nodes.Expression.StringLiteral;
import java.util.ArrayList;

public class StringArray extends ASTNode {
    ArrayList<StringLiteral> arr;

    public StringArray() {
        this.arr = new ArrayList<>();
    }

    public void addStringLiteral(StringLiteral string) {
        this.arr.add(string);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("StringArray\n");

        // Add elements with proper indentation
        builder.append(indent).append("├── Elements:\n");

        if (arr.isEmpty()) {
            builder.append(indent).append("    []\n");
        } else {
            for (StringLiteral string : arr) {
                if (string != null) {
                    builder.append(string.toString(indent + "    "));
                } else {
                    builder.append(indent).append("    null\n");
                }
            }
        }

        return builder.toString();
    }
}