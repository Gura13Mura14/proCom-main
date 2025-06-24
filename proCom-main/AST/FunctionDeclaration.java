package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration implements ASTNode {
    private String name; // Function name (IDENTIFIER)
    private ParameterList parameters; // List of parameters
    private String returnType; // Return type (IDENTIFIER)
    private Block block; // Block of the function

    public FunctionDeclaration(String name,ParameterList parameters,  String returnType, Block block) {
        this.name = name;
        this.parameters =parameters;
        this.returnType = returnType;
        this.block = block;
    }

    public String getName() {
        return name;
    }



    public String getReturnType() {
        return returnType;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "\nFunctionDeclaration{" +
                "\nname='" + name + '\'' +
                "," + parameters +
                ",\nreturnType='" + (returnType != null ? returnType : "void") + '\'' +
                "," + block +
                '}';
    }
}
