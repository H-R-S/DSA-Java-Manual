package Task_01;

public class multiplyVector {
	
	public static int VectorMultiplication(int A[], int B[]) {
		
		int size = A.length;
		int mul = 0;
	  
		for (int i = 0; i < size; i++) {
		
			mul = mul + A[i] * B[i];
		}
	  
		return mul;
	}
}
