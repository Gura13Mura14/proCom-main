package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList implements ASTNode {
    private List<Parameter> parameters; // List of parameters

    public ParameterList() {
        this.parameters = new ArrayList<>();
    }

    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "\nParameterList{" +
                "\nparameters=" + parameters +
                "\n}";
    }
}
