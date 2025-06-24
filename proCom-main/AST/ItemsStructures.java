package AST;

public class ItemsStructures implements ASTNode{

        private Object structure;

        public ItemsStructures(Object structure) {
            this.structure = structure;
        }

        public Object getStructure() {
            return structure;
        }

        @Override
        public String toString() {
            return "\nItemsStructure{" +
                     structure +
                    '}';
        }


}
