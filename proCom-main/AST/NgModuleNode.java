package AST;



    public class NgModuleNode implements ASTNode {
        private ObjectLiteral config;

        public NgModuleNode(ObjectLiteral config) {
            this.config = config;
        }

        public ObjectLiteral getConfig() {
            return config;
        }

        @Override
        public String toString() {
            return "\nNgModuleNode{" +
                    "config=" + config +
                    "\n}";
        }
    }


