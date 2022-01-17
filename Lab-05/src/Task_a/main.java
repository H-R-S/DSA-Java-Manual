package Task_a;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		power pp = new power();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = scan.nextInt();
     
		System.out.print("Enter power:");
		int pow = scan.nextInt();
		
		float power = pp.power(num,pow);
     
		if(pow > 0) {
     
			int p = (int) power;
			System.out.print(num+"^"+pow+" = "+p);
		}
     
		else {
     
			System.out.print(num+"^"+pow+" = "+power);
		}
	}
}
