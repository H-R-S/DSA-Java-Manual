package Task_01;

public class main {
	
	public static void main(String[] args)
	{
		CustomArrayList<Integer> ref = new CustomArrayList<Integer>();
		CustomArrayList<String> ref1 = new CustomArrayList<String>();
		System.out.println("1st Reference Variable ArrayList: ");
		ref.add(1);
		ref.add(2);
		ref.add(3);
		ref.add(4);
		System.out.println("Size of List: "+ref.getSize());
		System.out.println("Value 3 contains in List: "+ref.contain(3));
		System.out.println("Removed Value: "+ref.remove(3));
		System.out.println("Value 2 presents at "+ref.indexOff(2)+" index");
		
		for(int i=0;i<ref.getSize();i++)
			
			System.out.println("\tValue["+i+"]: "+ref.display(i));
		
		System.out.println("2nd Reference Variable: ");
		ref1.add("Muhammad");
		ref1.add("Haris");
		ref1.add("Ali");
		ref1.add("Ahmed");
		System.out.println("Size of List: "+ref1.getSize());
		System.out.println("Haris contains in List: "+ref1.contain("Haris"));
		System.out.println("Removed Value: "+ref1.remove("Ali"));
		System.out.println("Shivam presents at "+ref1.indexOff("Ahmed")+" index");
		
		for(int i=0;i<ref1.getSize();i++)
			
			System.out.println("\t Name["+i+"]: "+ref1.display(i));
	}
}
