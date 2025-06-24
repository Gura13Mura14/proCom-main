package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectType implements ASTNode {
    private List<TypeWithList> types; // List of types with optional lists

    public ObjectType() {
        this.types = new ArrayList<>();
    }

    public void addType(String identifier, ASTNode list) {
        this.types.add(new TypeWithList(identifier, list));
    }

    public List<TypeWithList> getTypes() {
        return types;
    }

    @Override
    public String toString() {
        return "\nObjectType{" +
                "types=" + types +
                "\n}";
    }

    // Helper class to represent type with optional list
    public static class TypeWithList {
        private String identifier;
        private ASTNode list;

        public TypeWithList(String identifier,ASTNode list) {
            this.identifier = identifier;
            this.list = list;
        }

        public String getIdentifier() {
            return identifier;
        }

        public ASTNode getList() {
            return list;
        }

        @Override
        public String toString() {
            return "\nTypeWithList{" +
                    "identifier='" + identifier + '\'' +
                   list!=null? ", list=" + list :""+
                    "\n}";
        }
    }
}
