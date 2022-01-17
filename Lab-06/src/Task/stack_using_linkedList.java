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
