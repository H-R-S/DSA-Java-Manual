# Data Structure & Algorithm Manual Lab: 05 | Task part b (Solved)
## [Lab: 05 | Task_01 part b](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05_Task_01_b.md)
Lab Tasks 1:
(b). Reverse a String using recursion in Java
### Code:
#### main.java:
```
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
```
#### reverse.java:
```
package Task_b;

public class reverse {

	public static String reverse(String s) {
	
		if (s.isEmpty())
	
			return s;
	
		return reverse(s.substring(1)) + s.charAt(0);
	}
}
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_b/Code/main.JPG)
#### power.java:
![reverse](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_b/Code/reverse.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_b/Output/output.JPG)