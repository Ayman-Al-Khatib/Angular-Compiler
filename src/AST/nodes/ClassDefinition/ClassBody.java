package AST.nodes.ClassDefinition;

import AST.nodes.ASTNode;
import java.util.ArrayList;

public class ClassBody extends ASTNode {
    ArrayList<ClassMember> classMembers;

    public ClassBody() {
        this.classMembers = new ArrayList<>();
    }

    public void addClassMember(ClassMember member) {
        this.classMembers.add(member);
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(indent).append("ClassBody\n");

        // Handle class members with proper indentation
        builder.append(indent).append("├── Members:\n");
        if (classMembers != null && !classMembers.isEmpty()) {
            for (int i = 0; i < classMembers.size(); i++) {
                ClassMember member = classMembers.get(i);
                if (member != null) {
                    builder.append(member.toString(indent + "    "));
                    if (i < classMembers.size() - 1) {
                        builder.append("\n");
                    }
                } else {
                    builder.append(indent).append("    null\n");
                }
            }
        } else {
            builder.append(indent).append("    None\n");
        }

        return builder.toString();
    }
}