package Task;

public class Tree {
	
	Node root;
	
	Tree() {
	
		root = null;
	}
	
	void preorder(Node node) {
	
		if (node == null)
	
			return;
	    System.out.print(node.item + "->");
	    preorder(node.left);
	    preorder(node.right);
	}
}
