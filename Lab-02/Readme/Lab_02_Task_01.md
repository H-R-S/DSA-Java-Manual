# Data Structure & Algorithm Manual Lab: 02 | Task_01 (Solved)
## [Lab: 02 | Task_01]()
Lab Tasks 1:
•	Develop Method in java which can find the smallest and the largest value from integer Array.
o	int[] TwoExtreamValue(int A[]).
•	Develop Method in java which can sort integer array using bubble sort. 
o	Int[] SortArray(int A[]).
•	Vector Multiplication Using two integer Arrays
o	int VectorMultiplication(int A[],int B[]).
### Code:
#### valueFinder.java:
```
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
```
#### sortArray.java:
```
package Task_01;

public class sortArray {
	
	public static int[] SortArray(int a[]) {
	
		int size = a.length;
	
		for(int i=0;i<size;i++) {

	
			for (int j=0;j<size;j++) {
	
				if(a[i]<a[j]) {
	
	
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
	
		return a;
	}
}
```
#### multiplyVector.java:
```
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
```
#### main.java:
```
package Task_01;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		valueFinder vf = new valueFinder();
		sortArray sa = new sortArray();
		multiplyVector mv = new multiplyVector();
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[3];
		int max = 3;
				
		System.out.println("1.Value Finder (smallest/largest)\n2.Sort Array \n3.Multiply Two Vectors\nSelect your option (1, 2, 3) : ");
		double selectedOption = scan.nextDouble();
		
		if (selectedOption == 1) {
			
			System.out.println("Enter integers numbers : ");
			
			for(int i = 0; i <= max; i++) {  
				
				array[i] = scan.nextInt();  
				vf.TwoExtreamValue(array);
			}  
		}
		else if (selectedOption == 2) {

			System.out.println("Enter integers numbers Array : ");
			
			for(int i = 0; i <= max; i++) {  
				
				array[i] = scan.nextInt();  
				sa.SortArray(array);
			}  
		}
		else {
			
			System.out.println("Enter integers numbers (with 'space') : ");
			
			for(int i = 0; i <= max; i++) {  
				
				array[i] = scan.nextInt();  
				mv.VectorMultiplication(null, null);
			} 
		}
	}
}
```
### Code Output:
```
```
### Code Screen Shots:
#### valueFinder.java:
![valueFinder](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/valueFinder.JPG)
#### sortArray.java:
![sortArray](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/sortArray.JPG)
#### multiplyVector.java:
![multiplyVector](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/multiplyVector.JPG)
#### main.java:
![main.java_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/main_ss1.JPG)
![main.java_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/main_ss2.JPG)
### Code Output Screen Shot:
![output]()