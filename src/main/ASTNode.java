import java.util.ArrayList;
import java.util.List;

public class ASTNode {
    String type;
    String value;
    List<ASTNode> children;

    public ASTNode(String type, String value) {
        this.type = type;
        this.value = value;
        children = new ArrayList<ASTNode>();
    }

    public void addChild(ASTNode child) {
        children.add(child);
    }

    public void printSubTree(String prefix, boolean isLast) {
        // Define ANSI color codes
        final String RESET = "\u001B[0m";
        final String BLUE = "\u001B[34m";
        final String GREEN = "\u001B[32m";
        final String CYAN = "\u001B[36m";
        final String YELLOW = "\u001B[33m";

        // Print the current node with visual indicators and colors
        System.out.print(BLUE + prefix + RESET); // Indentation in blue
        System.out.print((isLast ? "└── " : "├── ")); // Node connector
        System.out.println(
                GREEN + type + RESET + // Type in green
                        (value != null ? " " + YELLOW + "(" + value + ")" + RESET : "") // Value in yellow
        );

        // Update the prefix for children
        String childPrefix = prefix + (isLast ? "    " : "│   ");
        for (int i = 0; i < children.size(); i++) {
            children.get(i).printSubTree(childPrefix, i == children.size() - 1);
        }
    }

}
