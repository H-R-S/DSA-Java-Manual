# Data Structure & Algorithm Manual Lab: 05 | Task part a (Solved)
## [Lab: 05 | Task_01 part a](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05_Task_01_a.md)
Lab Tasks 1:
(a). Calculate power of a given number in java
### Code:
#### main.java:
```
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
```
#### power.java:
```
package Task_a;

public class power {
	
	public static float power(int num, int pow) {
	
		if(pow == 0) {
	 
			return 1;
		}
	 
		else if (pow < 0) {
	 
			return 1/(power(num,-pow));
		}
	 
		else {
	
			return (num*power(num,pow-1));
		}
	 }
}
```
### Code Output:
```
Enter a number: 3
Enter power: 3
3^3 = 27
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_a/Code/main.JPG)
#### power.java:
![power](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_a/Code/power.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_a/Output/output.JPG)