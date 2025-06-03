package AST.nodes.ImportStatement;

import AST.nodes.Statement;

abstract public class ImportStatement extends Statement {
    String url;
    public ImportStatement(String url) {
        this.url = url;
    }
}
