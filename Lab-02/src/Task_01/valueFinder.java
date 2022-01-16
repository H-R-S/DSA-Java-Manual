package Task_01;

public class valueFinder {
	
	public static int[] TwoExtreamValue(int A[]) {
		
		int size = A.length;
		int smallest, largest;
		int smallLarge[] = new int[2];
	
		smallest = A[0];
		largest = A[0];
	
		for(int i = 0; i < size; i++) {
	
			if(smallest>A[i])
				
				smallest = A[i];
	  
			if(largest<A[i])
	
				largest = A[i];
		}
	
		smallLarge[0] = smallest;
		smallLarge[1] = largest;
	
		return smallLarge;
	}
}
