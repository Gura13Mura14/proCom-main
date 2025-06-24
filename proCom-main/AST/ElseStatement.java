package AST;

public class ElseStatement implements ASTNode{

        private Block block; // The block to execute if the condition is false

        public ElseStatement(Block block) {
            this.block = block;
        }

        public Block getBlock() {
            return block;
        }

        @Override
        public String toString() {
            return "\nElseStatement{" +
                   block +
                    "\n}";
        }
    }
