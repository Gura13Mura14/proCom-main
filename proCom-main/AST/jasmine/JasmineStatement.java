package AST.jasmine;

import AST.ASTNode;

public abstract class JasmineStatement implements ASTNode {
    public abstract String toGrammarString(int indent);

}
