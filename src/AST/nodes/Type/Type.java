package AST.nodes.Type;

import AST.nodes.ASTNode;

abstract public class Type extends ASTNode {
    String name;
    public String getText() {
        return name;
    }
    public Type (String name) {
        this.name = name;
    }

}
