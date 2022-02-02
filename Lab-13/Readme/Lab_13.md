# Data Structure & Algorithm Manual Lab: 13 (Solved)
## [Lab: 13](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-13/Readme/Lab_13.md)
Lab Tasks:
•	Implement a method remove(s) that removes a value from hashmap.
•	Implement a method isempty() that returns a boolean value a that checks whether the hash map is empty or not.
•	Implement a method clear() that removes all values from the hashmap. 
### Code:
#### Hashing.java:
```
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
```

### Code Output:
```
[1, 2, 3]
HashSet is not empty
Removed all elements
```
### Code ScreenShots:
#### Hashing.java:
![Hashing](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-13/ScreenShots/Task/Code/Hashing.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-13/ScreenShots/Task/Output/output.JPG)