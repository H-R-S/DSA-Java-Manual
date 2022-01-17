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
