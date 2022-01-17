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
