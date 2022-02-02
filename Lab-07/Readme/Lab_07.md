# Data Structure & Algorithm Manual Lab: 07 (Solved)
## [Lab: 07](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/Readme/Lab_07.md)
Task 1:
Write a java program to sort the array by using bubble sort and selection sort.
### Code:
#### main.java:
```
package Task;

public class main {
	
	public static void main(String[] args) {  
		
		BubbleSort bs = new BubbleSort();
        
		int arr[] ={3,60,35,2,45,320,5};  
        
		System.out.println("\nArray Before Bubble Sort\n");  
        
		for(int i=0; i < arr.length; i++) {  
        
			System.out.print(arr[i] + " ");  
        }  
        
		System.out.println();  
        
		bs.bubbleSort(arr); 
        
		System.out.println("\nArray After Bubble Sort\n");  
        
		for(int i=0; i < arr.length; i++) {  
        
			System.out.print(arr[i] + " ");  
        }
	} 
}  
```
#### BubbleSort.java:
```
package Task;

public class BubbleSort {
	 
    public static void bubbleSort(int[] arr) {  
        
    	int n = arr.length;  
        int temp = 0;  
        
        for(int i=0; i < n; i++) {  
        
        	for(int j=1; j < (n-i); j++) {  
            
        		if(arr[j-1] > arr[j]) {  
                 
        			temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
        		}  
        	}   
        }   
    }
}
```
### Code Output:
```
Array Before Bubble Sort

3 60 35 2 45 320 5 

Array After Bubble Sort

2 3 5 35 45 60 320
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/ScreenShots/Task/Code/main.JPG)
#### BubbleSort.java:
![BubbleSort](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/ScreenShots/Task/Code/BubbleSort.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/ScreenShots/Task/Output/output.jpg)