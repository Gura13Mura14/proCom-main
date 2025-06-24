import AST.ASTNode;
import AST.Program;
import AST.CSS.*;
import AST.html.*;
import AST.jasmine.*;
import AST.*;
import org.antlr.v4.runtime.*;
import symbol.CSSSymbolTable;
import symbol.CSSSymbolTableBuilder;
import visitor.BaseVisitor;
import java.io.File;
import java.io.IOException;
import src.antlr.AngularParser;
import src.antlr.AngularLexer;
import analyzer.*;

import java.util.*;


import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {

    static void printAST(File file)throws IOException {
        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        AngularParser.ProgramContext tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0 || tree == null) {
            System.err.println("❌ Failed to parse: " + file.getName());
            return;
        }

        try {
            BaseVisitor visitor = new BaseVisitor();
            Program program = (Program) visitor.visit(tree);

            // ✅ تحدد هل هو ملف اختبار أم لا
            boolean isTestFile = file.getName().endsWith(".ts");

            if (!isTestFile) {
                // ✅ تحليل للكومبوننتات، مثل العادة
                for (ASTNode node : program.getBody()) {
                    if (node instanceof ComponentDeclaration component) {
                        new ComponentSemantic().analyze(component,
                                tree.getStart().getLine(),
                                tree.getStart().getCharPositionInLine());
                    } else if (node instanceof NgModuleNode ngModule) {
                        new NgSemantic().analyzeNgModule(ngModule,
                                tree.getStart().getLine(),
                                tree.getStart().getCharPositionInLine());
                        new BootSemantic().analyzeboot(ngModule,
                                tree.getStart().getLine(),
                                tree.getStart().getCharPositionInLine());
                    }
                }
            }

            System.out.println("✅ The Parser Output for " + file.getName() + " :");
            System.out.println(program.toGrammarString(0)); // يعرض الكل

        } catch (SemanticException e) {
            System.err.println("❗ Semantic Error in " + file.getName() + ": " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("💥 Visitor failed due to null node in tree for: " + file.getName());
            e.printStackTrace();
        }
    }


    static void printHtmlAST(File file) throws IOException {
        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        AngularParser.ProgramContext tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0 || tree == null) {
            System.err.println("❌ HTML Parse failed: " + file.getName());
            return;
        }

        try {
            BaseVisitor visitor = new BaseVisitor();
            Program program = (Program) visitor.visit(tree);
            System.out.println("🌐 HTML AST Output for " + file.getName() + ":");
            System.out.println(program); // هذا يعتمد على toString() للكلاسات

        } catch (Exception e) {
            System.err.println("❗ Error printing HTML AST: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void printCSSAST(File file) throws IOException {
        CharStream cs = fromFileName(file.getPath());
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(tokens);
        AngularParser.StylesheetContext tree = parser.stylesheet();

        if (parser.getNumberOfSyntaxErrors() > 0 || tree == null) {
            System.err.println("❌ Failed to parse CSS: " + file.getName());
            return;
        }

        try {
            BaseVisitor visitor = new BaseVisitor();
            StyleBlock styleBlock = (StyleBlock) visitor.visit(tree);

            System.out.println("✅ The CSS Parser Output for " + file.getName() + ":");
            System.out.println(styleBlock);

            CSSSymbolTableBuilder symbolTableBuilder = new CSSSymbolTableBuilder();
            CSSSymbolTable symbolTable = symbolTableBuilder.build(styleBlock);

            Set<String> components = Set.of("my-component",".product-detail",".app-container",".product-list",".app-product-list",".app-product-detail");
            Set<String> knownClassNames = Set.of("product-detail", "my-title", "btn-primary","app-container","product-list","app-product-list","app-product-detail");
            Set<String> knownIds = Set.of("main-container", "product-id");

            CSSSemanticAnalyzer analyzer = new CSSSemanticAnalyzer(
                    components, knownClassNames, knownIds, symbolTable
            );
            analyzer.analyze(styleBlock);

            System.out.println("📘 CSS Symbol Table for " + file.getName() + ":");
            symbolTable.printSymbolTable();

        } catch (NullPointerException e) {
            System.err.println("💥 Visitor failed due to null node in CSS: " + file.getName());
            e.printStackTrace();
        }
    }


    static void getTests(String path) throws IOException {
        File folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("❌ Directory not found or is not a directory: " + folder.getAbsolutePath());
            return;
        }

        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.err.println("📂 Directory is empty or inaccessible: " + folder.getAbsolutePath());
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                getTests(file.getPath());
            } else if (file.getName().endsWith(".ts")) {
                // ✅ ✅ هذا يشمل ملفات .ts العادية وملفات .spec.ts
                printAST(file);
            } else if (file.getName().endsWith(".css")) {
                printCSSAST(file);
            } else if (file.getName().endsWith(".html")) {
                printHtmlAST(file);
            }
        }
    }
    public static void main(String[] args) throws IOException {

        getTests("C://Users//maisa//proCom-main//proCom-main//Tset//app");

        // Main m=new Main();
    }

}