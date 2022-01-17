package Task_b;

import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		
		reverse r = new reverse();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter String:");
	    
		String str = scan.nextLine();
	    String rev = r.reverse(str);
	
	    System.out.print("Reverse String is: "+rev);
	}
}
