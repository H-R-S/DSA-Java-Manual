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
