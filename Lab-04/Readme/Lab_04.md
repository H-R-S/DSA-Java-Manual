# Data Structure & Algorithm Manual Lab: 04 (Solved)
## [Lab: 04 | Task](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/Readme/Lab_04.md)
Lab Tasks:
Write a program in java to insert a new node at the middle of Singly Linked List.
### Code:
#### main.java:
```
package Task;

public class main {

	
	public static void main(String[] args) {  

		InsertNode sList = new InsertNode();  
		
		sList.addNodeAtEnd(1);  
		sList.addNodeAtEnd(2); 
		sList.addNodeAtEnd(5); 
		sList.display();  
		sList.addInMid(3);  
		
		System.out.println("Updated List: ");  
		
		sList.display();  
		sList.addInMid(4);  
		
		System.out.println("Updated List: ");  
		
		sList.display();
		
		System.out.println("Updated List: "); 
		
		sList.addAtStart(0);
		sList.display();
	
	}  
}
```
#### InsertNode.java:
```
package Task;

public class InsertNode {  

	class Node {  
		
		int data;  
	    Node next;  
	
	    public Node(int data) {  
	
	    	this.data = data;  
	    	this.next = null;  
	    }  
	}
	
	public int size;   
	public Node head = null;  
	public Node tail = null;  
 
	public void addAtStart(int data) {  
	        
		Node newNode = new Node(data);  
	
		if (head == null) {  
	
			head = newNode;  
			tail = newNode;  
	    }  
		
		else {  
	            
			Node temp = head;  
	        head = newNode;   
	        head.next = temp;  
	    }  
	}   
	
	public void addNodeAtEnd(int data) {  
		
		Node newNode = new Node(data);    
	
		if(head == null) {  
	
			head = newNode;  
			tail = newNode;  
	    }  
	
		else {  
			
			tail.next = newNode;  
			tail = newNode;  
	    }  
	
		size++;  
	}    
	
	public void addInMid(int data) {  
	
		Node newNode = new Node(data);  
	
		if(head == null) {  
	
			head = newNode;  
			tail = newNode;  
	    }  
		
		else {  
	
			Node temp, current;  
			int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
			temp = head;  
			current = null;  
	
			for(int i = 0; i < count; i++) {  
	
				current = temp;  
				temp = temp.next;  
	        }  
	
			current.next = newNode;  
			newNode.next = temp;  
	    }  
	
		size++;  
	}   
	
	public void display() {  
	
		Node current = head;  
	
		if(head == null) {  
	
			System.out.println("List is empty");  
			return;  
	    }  
	
		while(current != null) {    
	
			System.out.print(current.data + " ");  
			current = current.next;  
	    }  
	
		System.out.println();  
	}
}
```
### Code Output:
```
```
#### Code Screen Shot:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/main.JPG)
![InsertNode_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/InsertNode_ss1.JPG)
![InsertNode_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/InsertNode_ss2.JPG)
![InsertNode_ss3](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/InsertNode_ss3.JPG)
#### Code Output Screen Shot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Output/output.JPG)
