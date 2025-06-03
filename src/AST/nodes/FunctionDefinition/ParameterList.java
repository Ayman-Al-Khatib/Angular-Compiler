package AST.nodes.FunctionDefinition;

import AST.nodes.ASTNode;
import java.util.ArrayList;

public class ParameterList extends ASTNode {
    ArrayList<Parameter> parameters;

    public ParameterList() {
        this.parameters = new ArrayList<>();
    }
    public ArrayList<Parameter> getParams() {
        return this.parameters;
    }
    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ParameterList\n");

        // Add parameters list with proper indentation
        if (parameters != null && !parameters.isEmpty()) {
            for (Parameter param : parameters) {
                if (param != null) {
                    builder.append(param.toString(indent + "    "));
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