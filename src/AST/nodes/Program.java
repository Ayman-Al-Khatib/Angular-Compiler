package AST.nodes;

import java.util.ArrayList;

public class Program extends ASTNode {
    ArrayList<Statement> statements;

    public Program() {
        statements = new ArrayList<>();
    }

    public void addStatement(Statement stmt) {
        this.statements.add(stmt);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("Program\n");

        // Add statements with tree-like structure
        builder.append(indent).append("└── Statements:\n");

        if (statements.isEmpty()) {
            builder.append(indent).append("    []\n");
        } else {
            for (int i = 0; i < statements.size(); i++) {
                Statement stmt = statements.get(i);
                if (stmt != null) {
                    builder.append(stmt.toString(indent + "    "));
                    if (i < statements.size() - 1) {
                        builder.append("\n");
                    }
                }
            }
        }

        return builder.toString();
    }
}