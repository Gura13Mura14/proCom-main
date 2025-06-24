package AST;

import java.util.ArrayList;
import java.util.List;

public class CallingMethod implements ASTNode {
    private String methodName; // Method name (IDENTIFIER or CATCH)
    private List<ASTNode> arguments; // List of arguments (expressions)
    private List<Object> chainedCalls; // Chained calls (CallingMethod, dataStructure, or plain string for IDENTIFIER)

    public CallingMethod(String methodName) {
        this.methodName = methodName;
        this.arguments = new ArrayList<>();
        this.chainedCalls = new ArrayList<>();
    }

    public void addArgument(ASTNode argument) {
        arguments.add(argument);
    }

    public void addChainedCall(Object chainedCall) {
        chainedCalls.add(chainedCall);
    }

    public String getMethodName() {
        return methodName;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    public List<Object> getChainedCalls() {
        return chainedCalls;
    }

    @Override
    public String toString() {
        return "CallingMethod{" +
                "methodName='" + methodName + '\'' +
               arguments +
                ", chainedCalls=" + chainedCalls +
                '}';
    }
}
