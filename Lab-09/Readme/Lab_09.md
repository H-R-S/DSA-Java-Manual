# Data Structure & Algorithm Manual Lab: 09 (Solved)
## [Lab: 09](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/Readme/Lab_09.md)
Task # 1: 
Implement Pre-order traversal in java.
### Code:
#### main.java:
```
package Task;

public class main {
	
	public static void main(String[] args) {
	    
		Tree tree = new Tree();
	
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
	
		System.out.println("\nPreorder traversal ");
	
		tree.preorder(tree.root);
	}
}
```
#### Node.java:
```
package Task;

public class Node {
	
	int item;
	Node left, right;
	
	public Node(int key) {
	
		item = key;
		left = right = null;
	}
}
```
#### Tree.java:
```
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
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Code/main.jpg)
#### Node.java:
![Node](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Code/Node.jpg)
#### Tree.java:
![Tree](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Code/Tree.jpg)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Output/output.png)