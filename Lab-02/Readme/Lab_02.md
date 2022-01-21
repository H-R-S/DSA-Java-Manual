# Data Structure & Algorithm Manual Lab: 02 (Solved)
### Index:
- ### [Lab-02 | Task_01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_01.md)
- ### [Lab-02 | Task_02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_02.md)
___
## [Lab: 02 | Task_01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_01.md)
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
___
## [Lab: 02 | Task_02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_01.md)
Lab Tasks 2:
Develop Generic Class which can set Data type of Single dimension array.
### Code:
#### main.java:
```
package Task_02;

public class main {

	public static void main(String[] args) {

		final int length = 5;

		Array<Integer>int_Array = new Array(length);

		System.out.print("\nGeneric Array <Integer>:" + " ");

		for (int i = 0; i < length; i++)

			int_Array.set(i, i * 2);
			System.out.println(int_Array);

		Array<String>str_Array = new Array(length);
		
		System.out.print("\nGeneric Array <String>:" + " ");
		
		for (int i = 0; i < length; i++)

			str_Array.set(i, String.valueOf((char)(i + 97)));
			System.out.println(str_Array);
	}
}
```
#### array.java:
```
package Task_02;

import java.util.Arrays;

class Array<E> {
		
		private final Object[] obj_array;
		public final int length;

		public Array(int length) {

			obj_array = new Object [length];
			this.length = length;
		}

		E get(int i) {
			
			@SuppressWarnings("unchecked")
			final E e = (E)obj_array[i];
			return e;
		}

		void set(int i, E e) {

			obj_array[i] = e;
		}
		
		@Override
		public String toString() {
			
			return Arrays.toString(obj_array);
		}
}
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_02/Code/main.JPG)
![array](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_02/Code/array.JPG)
### Code Output ScreenShot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_02/Output/output.JPG)
