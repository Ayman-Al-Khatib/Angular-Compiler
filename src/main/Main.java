import Exceptions.SemanticErrorCollector;
import SymbolTables.SymbolTable;
import antlr.AngularLexer;
import antlr.AngularParser;
import AST.nodes.Program;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import Visitor.ASTBuilderVisitor;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] options = {
                "html-test1.html",
                "html-test2.html",
                "service-test1.ts",
                "service-test2.ts",
                "component-test1.ts",
                "component-test2.ts",
                "semantic-test.ts"
        };

        System.out.println("Please choose an option by entering the corresponding number:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.print("Enter your choice (1-7): ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= options.length) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        String selected = "src/tests/" + options[choice - 1];
        if (selected.endsWith(".html")) {
//            AngularTemplate(selected);
        } else {
            AngularLogic(selected);
        }

        if (SemanticErrorCollector.hasErrors()) {
            List<String> errors = SemanticErrorCollector.getErrors();

            // Write to a file
            try (PrintWriter writer = new PrintWriter("src/tests/semantic_errors.txt")) {
                for (String error : errors) {
                    writer.println(error);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.exit(1); // Exit with failure status
        }


    }

//    public static void AngularTemplate(String fileName) throws IOException {
//        File file = new File(fileName);
//        FileInputStream fileInputStream = new FileInputStream(file);
//
//        ANTLRInputStream input = new ANTLRInputStream(fileInputStream);
//
//        AngularTemplateLexer lexer = new AngularTemplateLexer(input);
//
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        AngularTemplateParser parser = new AngularTemplateParser(tokens);
//
//        ParseTree tree = parser.htmlTemplate();
//
//        AngularTemplateASTBuilder astBuilder = new AngularTemplateASTBuilder(parser, tree);
//
//        astBuilder.printASTTree();
//    }

    public static void AngularLogic(String fileName) throws IOException {
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);

        ANTLRInputStream input = new ANTLRInputStream(fileInputStream);

        antlr.AngularLexer lexer = new AngularLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        antlr.AngularParser parser = new AngularParser(tokens);

        ParseTree tree = parser.program();

        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        Program program = (Program) visitor.visit(tree);
        System.out.println(program);
        SymbolTable.printSymbolTable();

    }
}
