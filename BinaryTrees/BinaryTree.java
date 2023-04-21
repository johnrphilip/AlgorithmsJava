
public class BinaryTree {

	    private static final String INDENT = "    ";

	    public static void print(BinaryTreeNode root) {
	        printHelper(root, 0);
	    }

	    private static void printHelper(BinaryTreeNode node, int indentLevel) {
	        if (node == null) {
	            return;
	        }
	        printHelper(node.getRight(), indentLevel + 1);
	        System.out.print(getIndentString(indentLevel));
	        System.out.println(node.getValue());
	        printHelper(node.getLeft(), indentLevel + 1);
	    }

	    private static String getIndentString(int indentLevel) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < indentLevel; i++) {
	            sb.append(INDENT);
	        }
	        return sb.toString();
	    }
	    
	    
	    
}
    