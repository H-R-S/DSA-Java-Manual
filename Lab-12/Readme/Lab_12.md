# Data Structure & Algorithm Manual Lab: 12 (Solved)
## [Lab: 12](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/Readme/Lab_12.md)
Lab Tasks:
•	Implement a method contains(s) that returns a boolean value that checks whether the string s is in the table.
•	Implement a method size() that returns the number of strings in the table
### Code:
#### HashTable.java:
```
package Task;

public class HashTable {


	static private class ListNode {

         Object key;
         Object value;
         ListNode next;
	}

	private ListNode[] table;
	private int count;

	public HashTable() {

		table = new ListNode[64];
	}

	public HashTable(int initialSize) {

		table = new ListNode[initialSize];
	}

	void dump() {

		System.out.println();

		for (int i = 0; i <table.length; i++) {

			System.out.print(i + ":");

			ListNode list = table[i];

			while (list != null) {

				System.out.print(" (" + list.key + "," + list.value + ")");

				list = list.next;

            }

			System.out.println();
		}
	}

	public void put(Object key, Object value) {
 
		int bucket = hash(key);
		ListNode list = table[bucket];

		while (list != null) {

			if (list.key.equals(key))

				break;

			list = list.next;
        }

		if (list != null) {

			list.value = value;
        }

		else {

			if (count >= 0.75*table.length) {

				resize(); 
            } 

			ListNode newNode = new ListNode();
			newNode.key = key;
			newNode.value = value;
			newNode.next = table[bucket];
			table[bucket] = newNode; 

			count++;
            
		}
	}

	public Object get(Object key) {

		int bucket = hash(key);
		ListNode list = table[bucket];

		while (list != null) {

			if (list.key.equals(key))

				return list.value;

			list = list.next;
        }

		return null;
	}

	public void remove(Object key) {

		int bucket = hash(key);

		if (table[bucket] == null) {

			return;
        }

		if (table[bucket].key.equals(key)) {

			table[bucket] = table[bucket].next;

			count--;

			return;
		}
		
		ListNode prev = table[bucket];
		ListNode curr = prev.next;

		while (curr != null&& ! curr.key.equals(key)) {

			curr = curr.next;
			prev = curr;
		}

		if (curr != null) {

			prev.next = curr.next;

			count--;			
		}
	}

	public boolean containsKey(Object key) {

		int bucket = hash(key);
		ListNode list = table[bucket];

		while (list != null) {

			if (list.key.equals(key))

				return true;

			list = list.next;
		}

		return false;
	}

	public int size() {
 
		return count;
	}

	private int hash(Object key) {

		return (Math.abs(key.hashCode())) % table.length;
	}

	private void resize() {

		ListNode[] newtable = new ListNode[table.length*2];

		for (int i = 0; i <table.length; i++) {

			ListNode list = table[i];

			while (list != null) {

				ListNode next = list.next;

				int hash = (Math.abs(list.key.hashCode())) % newtable.length;
				list.next = newtable[hash];
				newtable[hash] = list;
				list = next;
			}
		}

		table = newtable;
	}
}
```
### Code Output:
```
```
### Code ScreenShots:
#### HashTable.java:
![HashTable_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss1.JPG)
![HashTable_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss2.JPG)
![HashTable_ss3](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss3.JPG)
![HashTable_ss4](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss4.JPG)
![HashTable_ss5](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss5.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Output/output.JPG)