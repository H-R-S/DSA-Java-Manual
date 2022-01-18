package task;

import task.ConvertBTtoBST.Node;

public class main {
	
	public static void main(String[] args) {  

		ConvertBTtoBST bt = new ConvertBTtoBST(); 
		
		bt.root = new Node(15); 
		bt.root.left = new Node(5);
		bt.root.right = new Node(20);
		bt.root.left.left = new Node(70); 
		bt.root.left.right = new Node(3);
		bt.root.right.left = new Node(10);
		bt.root.right.right = new Node(60); 
		bt.root.right.right.left = new Node(90); 
		bt.root.right.right.right = new Node(16); 

		System.out.println("Inorder representation of binary tree: ");  
		
		bt.inorderTraversal(bt.root);  

		Node bst = bt.convertBTBST(bt.root);  

		System.out.println("\nInorder representation of resulting binary search tree: ");  
		
		bt.inorderTraversal(bst);  
	}  
}
