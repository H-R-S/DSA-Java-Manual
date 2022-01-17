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
