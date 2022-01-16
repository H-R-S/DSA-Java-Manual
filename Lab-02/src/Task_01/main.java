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
