package AST;

import java.util.ArrayList;
import java.util.List;

public class Imports implements ASTNode {
    private List<String> imports;

    public Imports() {
        this.imports = new ArrayList<>();
    }
    public void addChild(String child){
        this.imports.add(child);

    }

    public List<String> getImports() {
        return imports;
    }

    @Override
    public String toString() {
        return "\nImports{" +
                imports +
                " '}'";
    }
}
