# Data Structure & Algorithm Manual Lab: 03 (Solved)
## [Lab: 03 | Task](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_03.md)
Task 1: 
Develop your own ArrayList in Java having following methods:
•	add ()
•	remove() 
•	get()
•	contain() 
•	is_empty()
•	IndexOff()
•	ToArray()
•	TrimToSize()
### Code:
#### CustomArrayList.java:
```
package Task_01;

public class CustomArrayList<T>
{
	private T[] array;
	private int size = 0;
	public CustomArrayList()
	{
		array = (T[]) new Object[2];
	}
	public void add(T value)
	{
		array[size] = value;
		size++;
		if(size==array.length)
		{
			T[] newArray = (T[]) new Object[array.length*2];
			for(int i=0;i<array.length;i++)
			newArray[i] = array[i];
			array = newArray;
		}
	}
	public T remove(T value)
	{
		for(int i=0;i<size-1;i++)
		{
			if(value==array[i])
				array[i] = array[i+1];
		}
		size--;
		return value;
	}
	public int getSize()
	{
		return size;
	}
	
	public boolean contain(T value)
	{
		for(int i=0;i<size;i++)
		{
			if(value==array[i])
				return true;
		}
		return false;
	}
	
	public int indexOff(T value)
	{
		for(int i=0;i<size;i++)
		{
			if(value==array[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
			return true;
		else
			return false;
	}
	
	public T display(int index)
	{
		return array[index];
	}
}
```
#### main.java:
```
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
```
### Code Output:
```
1st Reference Variable ArrayList: 
Size of List: 4
Value 3 contains in List: true
Removed Value: 3
Value 2 presents at 1 index
	Value[0]: 1
	Value[1]: 2
	Value[2]: 4
2nd Reference Variable: 
Size of List: 4
Haris contains in List: true
Removed Value: Ali
Shivam presents at 2 index
	 Name[0]: Muhammad
	 Name[1]: Haris
	 Name[2]: Ahmed

```
### Code ScreenShots:
#### CustomArrayList.java:
![CustomArrayList_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-03/ScreenShots/Code/customArrayList_ss1.JPG)
![CustomArrayList_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-03/ScreenShots/Code/customArrayList_ss2.JPG)
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-03/ScreenShots/Code/main.JPG)
### Code Output ScreeenShot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-03/ScreenShots/Output/output.JPG)
