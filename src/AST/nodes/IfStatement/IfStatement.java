package AST.nodes.IfStatement;

import AST.nodes.Expression.Expression;
import AST.nodes.Statement;
import java.util.ArrayList;

public class IfStatement extends Statement {
    Expression condition;
    Statement statement;
    ArrayList<ElseIfBlock> elseIfBlocks;
    ElseBlock elseBlock;

    public IfStatement(Expression condition, Statement statement, ElseBlock elseBlock) {
        this.condition = condition;
        this.statement = statement;
        this.elseBlock = elseBlock;
        this.elseIfBlocks = new ArrayList<>();
    }

    public void addElseIfBlock(ElseIfBlock block) {
        this.elseIfBlocks.add(block);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("IfStatement\n");

        // Add condition with proper indentation
        builder.append(indent).append("├── Condition: ");
        if (condition != null) {
            builder.append("\n").append(condition.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add main statement with proper indentation
        builder.append(indent).append("├── Statement: ");
        if (statement != null) {
            builder.append("\n").append(statement.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        // Add else-if blocks with proper indentation
        builder.append(indent).append("├── ElseIfBlocks: ");
        if (elseIfBlocks != null && !elseIfBlocks.isEmpty()) {
            builder.append("\n");
            for (ElseIfBlock block : elseIfBlocks) {
                if (block != null) {
                    builder.append(block.toString(indent + "    "));
                } else {
                    builder.append(indent).append("    - null\n");
                }
            }
        } else {
            builder.append("[]\n");
        }

        // Add else block with proper indentation
        builder.append(indent).append("└── ElseBlock: ");
        if (elseBlock != null) {
            builder.append("\n").append(elseBlock.toString(indent + "    "));
        } else {
            builder.append("null\n");
        }

        return builder.toString();
    }
}