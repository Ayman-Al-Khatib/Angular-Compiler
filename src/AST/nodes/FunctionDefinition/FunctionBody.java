package AST.nodes.FunctionDefinition;

import AST.nodes.ASTNode;
import AST.nodes.Statement;
import java.util.ArrayList;

public class FunctionBody extends ASTNode {
    ArrayList<Statement> statements;
    ReturnStatement returnStatement; // can be null

    public FunctionBody(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement st) {
        this.statements.add(st);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("FunctionBody\n");

        // Handle statements list
        builder.append(indent).append("├── Statements:\n");
        if (statements != null && !statements.isEmpty()) {
            for (Statement stmt : statements) {
                if (stmt != null) {
                    builder.append(stmt.toString(indent + "    "));
                } else {
                    builder.append(indent).append("    - null\n");
                }
            }
        } else {
            builder.append(indent).append("    []\n");
        }

        // Handle return statement
        builder.append(indent).append("└── Return: ");
        if (returnStatement != null) {
            builder.append("\n").append(returnStatement.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}