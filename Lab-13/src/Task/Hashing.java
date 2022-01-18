package Task;

import java.util.*; 

public class Hashing { 
	
	public static void main(String[] args) { 
		
		HashSet<Integer>A = new HashSet<Integer>(); 

		A.add(1); 
		A.add(2); 
		A.add(3); 

		System.out.println(A);

		if(A.isEmpty()) {
			
			System.out.println("HashSet is empty");
		}

		else {

			System.out.println("HashSet is not empty");
		}
		
		A.clear();

		System.out.println("Removed all elements");
	}
}
