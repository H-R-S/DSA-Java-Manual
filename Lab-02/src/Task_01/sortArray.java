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
