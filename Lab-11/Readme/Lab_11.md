# Data Structure & Algorithm Manual Lab: 11 (Solved)
## [Lab: 11](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/Readme/Lab_11.md)
Lab Tasks:
Implement a binary search tree and AVL tree from the following traversals:
{15, 5, 20, 70, 3, 10, 60, 90, 16}
•	Write a method that search 15 but your tree should be BST and AVL after deletion
•	Write a method to Reverse path of Binary Search Tree.
### Code:
#### main.java:
```
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
```
#### ConvertBTtoBST.java:
```
package task;

import java.util.Arrays;  

public class ConvertBTtoBST {  
	
	public static class Node{

		int data;  
        Node left;  
        Node right;  


        public Node(int data){  

        	this.data = data;  
        	this.left = null;  
        	this.right = null;  
        }  
	}  

	public Node root;  

	int[] treeArray;  
	int index = 0;  

	public ConvertBTtoBST() {  

		root = null;  
    }  


	public Node convertBTBST(Node node) {  

		int treeSize = calculateSize(node);  
		treeArray = new int[treeSize];  

		convertBTtoArray(node);  

		Arrays.sort(treeArray);  
        Node d = createBST(0, treeArray.length -1);  

        return d;  
    }  

	public int calculateSize(Node node) {  

		int size = 0;  

		if (node == null)  

			return 0;  

		else {  

			size = calculateSize (node.left) + calculateSize (node.right) + 1;  

			return size;  
        }  
    }  

	public void convertBTtoArray(Node node) {  

		if(root == null) {  

			System.out.println("Tree is empty");  
			
			return;  
        }  

		else {  

			if(node.left != null)  

				convertBTtoArray(node.left);  
				treeArray[index] = node.data;  
				index++;  

				if(node.right != null)  

					convertBTtoArray(node.right);  
        }  
	}  

	public Node createBST(int start, int end) {  

		if (start>end) {  

			return null;  
        }  

		int mid = (start + end) / 2;  
        Node node = new Node(treeArray[mid]);  


        node.left = createBST(start, mid - 1);  
        node.right = createBST(mid + 1, end);  

        return node;  
    }  

	public void inorderTraversal(Node node) {  

		if(root == null) {  

			System.out.println("Tree is empty");  

			return;  
        }  
		else {  

			if(node.left!= null)  

				inorderTraversal(node.left);  
				System.out.print(node.data + " ");  

				if(node.right!= null)  

					inorderTraversal(node.right);  
        }  
	}  
}
```

### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/main.jpg)
#### ConvertBTtotBST.java:
![ConvertBTtotBST_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss1.JPG)
![ConvertBTtotBST_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss2.JPG)
![ConvertBTtotBST_ss3](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss3.JPG)
![ConvertBTtotBST_ss4](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss4.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Output/output.JPG)