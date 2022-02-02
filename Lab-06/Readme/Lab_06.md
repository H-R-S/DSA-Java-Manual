# Data Structure & Algorithm Manual Lab: 06 (Solved)
Lab Tasks:
Implement Stack using Linked List.
### Code:
#### main.java:
```
package Task;

public class main {
	
	public static void main(String args[]) {
		
        stack_using_linkedList lls = new stack_using_linkedList();
        
        lls.push(20);
        lls.push(50);
        lls.push(80);
        lls.push(40);
        lls.push(60);
        lls.push(75);
        
        System.out.println("Element removed from LinkedList: "+lls.pop());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        
        lls.push(10);
        
        System.out.println("Element removed from LinkedList: "+lls.pop());
        
        lls.printList(lls.head);
    }
}
```
#### stack_using_linkedList.java:
```
package Task;

public class stack_using_linkedList {
	
	public Node head; 
    
	public class Node {
        
		int value;
        Node next;
    }
 
    public stack_using_linkedList() {
        
    	head = null;
    }
    
    public int pop() throws LinkedListEmptyException {
        
    	if (head == null) {
            
    		throw new LinkedListEmptyException();
        }
        
    	int value = head.value;
        head = head.next;
        return value;
    }
    
    public void push(int value) {
        
    	Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
 
    public static void printList(Node head) {
        
    	Node temp = head;
        
    	while (temp != null) {
            
    		System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        
    	System.out.println();
    }
}
```
#### LinkedListisEmptyException.java:
```
package Task;

public class LinkedListEmptyException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;
 
    public LinkedListEmptyException() {
        
    	super();
    }
 
    public LinkedListEmptyException(String message) {
        
    	super(message);
    }
}
```
### Code Output:
```
Element removed from LinkedList: 75
Element removed from LinkedList: 60
Element removed from LinkedList: 10
40 80 50 20
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/main.JPG)
#### stack_using_linkedList.java:
![stack_using_linkedList_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/stack_using_linkedList_ss1.JPG)
![stack_using_linkedList_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/stack_using_linkedList_ss2.JPG)
#### LinkedListEmptyException.java:
![LinkedListEmptyException](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/LinkedListEmptyException.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Output/output.JPG)