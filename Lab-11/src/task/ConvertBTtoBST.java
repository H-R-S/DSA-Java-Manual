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
