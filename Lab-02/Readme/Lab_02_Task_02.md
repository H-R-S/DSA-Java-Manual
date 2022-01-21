# Data Structure & Algorithm Manual Lab: 02 | Task_02 (Solved)
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