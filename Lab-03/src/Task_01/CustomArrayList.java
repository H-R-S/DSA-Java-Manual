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
