package Task_b;

public class reverse {

	public static String reverse(String s) {
	
		if (s.isEmpty())
	
			return s;
	
		return reverse(s.substring(1)) + s.charAt(0);
	}
}
