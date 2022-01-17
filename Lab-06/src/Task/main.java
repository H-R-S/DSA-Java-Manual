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
