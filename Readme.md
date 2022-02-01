# Data Structure & Algorithm Manual (Solved)
## WordFile (with ScreenShots) : [DSA_Java_Manual.docs](https://github.com/H-R-S/DSA-Java-Manual/blob/main/WordFile/HRS_Data%20Structure%20%26%20Algorithm%20Manual%20(Solved)_WordFile.docx)
### Index:
- ### [Lab-01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/Readme/Lab_01.md)
- ### [Lab-02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02.md)
- ### [Lab-03](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-03/Readme/Lab_03.md)
- ### [Lab-04](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/Readme/Lab_04.md)
- ### [Lab-05](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05.md)
- ### [Lab-06](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/Readme/Lab_06.md)
- ### [Lab-07](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/Readme/Lab_07.md)
- ### [Lab-08](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-08/Readme/Lab_08.md)
- ### [Lab-09](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/Readme/Lab_09.md)
- ### [Lab-10](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-10/Readme/Lab_10.md)
- ### [Lab-11](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/Readme/Lab_11.md)
- ### [Lab-12](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/Readme/Lab_12.md)
- ### [Lab-13](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-13/Readme/Lab_13.md)
- ### [Lab-14](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-14/Readme/Lab_14.md)
___
## [Lab: 01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/Readme/Lab_01.md)
### Index:
- ### [Lab-01 | Task](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/Readme/Lab_01_Task.md)
- ### [Lab-01 | Assignment](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/Readme/Lab_01_Assignment.md)
___
## [Lab-01 | Task](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/Readme/Lab_01_Task.md)
Lab Tasks 1:
-
Develop Java Class IU_Mark_Sheet with following Constructor and Methods.
Constructor:
- IU_Mark_Sheet(String Student, String Registration Number);
Methods: 
- Void Subject_Name(String Subject[]);
- Void Subject_Max_Mark(double MaxMark[]);
- Void Subject_Scored_Mark(double ScoredMark[]);
- Double StudentGPA();
### Code:
#### main.java:
```
package Task;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String Name = scan.nextLine();
		
		System.out.println("Enter Student Registration Number : ");
		String RegNo = scan.nextLine();
		
		System.out.println("Enter Subject Name : ");
		String SubName = scan.nextLine();
		
		System.out.println("Enter Max Marks : ");
		double MaxMarks = scan.nextDouble();
		
		System.out.println("Enter Obtained Marks : ");
		double ObtMarks = scan.nextDouble();
		
		IU_Mark_Sheet MS = new IU_Mark_Sheet(Name, RegNo);
		MS.Subject_Name(SubName);
		MS.Subject_Max_Mark(MaxMarks);
		MS.Subject_Scored_Mark(ObtMarks);
		MS.StudentGPA();
		MS.IU_Marks_Sheet();
	}
}
```
#### IU_Mark_Sheet.java:
```
package Task;

public class IU_Mark_Sheet {
	
	String Student;
	String RegistrationNumber;
	String Subject;	
	double MaxMark;
	double ScoredMark;
	double gpa;
	
	IU_Mark_Sheet(String Student, String RegistrationNumber) {
		this.Student= Student;
		this.RegistrationNumber = RegistrationNumber;
	}
	
	void Subject_Name(String Subject) {
		this.Subject=Subject;
	}
	
	void Subject_Max_Mark(double MaxMark) {
		this.MaxMark=MaxMark;
	}
	
	void Subject_Scored_Mark(double ScoredMark) {
		this.ScoredMark=ScoredMark;
	}
	
	double StudentGPA() {
		double percentage;
		percentage = (ScoredMark/MaxMark)*100;
		if(percentage>=88)
			gpa = 4.0;
		else if(percentage<=87 && percentage>=81)
			gpa = 3.5;
		else if(percentage<=80 && percentage>=74)
			gpa = 3.0;
		else if(percentage<=73 && percentage>=67)
			gpa = 2.5;
		else if(percentage<=66 && percentage>=60)
			gpa = 2.0;
		else
			gpa = 0;
		return gpa;
	}
	
	void IU_Marks_Sheet() {
		
		System.out.println("\n\n__________________________________________________________\n\n");
		System.out.println("\t\t IQRA UNIVERSITY MARK SHEET\n\t\t ");
		System.out.println("\nNAME : " + Student + "\nRegistration Number : " + RegistrationNumber);
		System.out.println("\n\n\nSUBJECT\t\tMAX MARKS \tOBTAINED MARKS \tGPA\n");
		System.out.println(Subject + "\t\t" + MaxMark + "\t\t" + ScoredMark + "\t\t" + gpa);
		System.out.println("\n\n___________________________________________________________\n\n");
	}
}
```
### Code Output:
```
Enter Student Name: 
Muhammad Haris
Enter Student Registration Number : 
51379
Enter Subject Name : 
DSA
Enter Max Marks : 
100
Enter Obtained Marks : 
92


__________________________________________________________


		 IQRA UNIVERSITY MARK SHEET
		 

NAME : Muhammad Haris
Registration Number : 51379



SUBJECT		MAX MARKS 	OBTAINED MARKS 	GPA

DSA		100.0		92.0		4.0


___________________________________________________________
```
### Code Screen Shots:
#### main.java:
![main.java](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Code/main.jpg)
#### IU_Mark_Sheet.java:
![IU_Mark_Sheet.java SS1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Code/ms_ss1.JPG)
![IU_Mark_Sheet.java SS2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Code/ms_ss2.JPG)
### Code Ouput Screen Shot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Output/output.JPG)
___
## [Lab-01 | Assignment](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/Readme/Lab_01_Assignment.md)
Assignment:
-
Program Statement:
You are required to model a vehicle parking lot system. The parking lot has a facility to park cars and scooters. The parking lot contains four parking lanes-two for cars and two for scooters.
Each lane can hold ten vehicles. There is an operator with a console at the East end of the parking lot. The system should be able to handle following scenarios.
Arrival of a vehicle:
- Type of vehicle (car or scooter) and Registration No. of vehicle should be entered 
- Program should display suitable parking slot
- Vehicles arrive at East end, leave from West end
Departure of Car:
- If not western most, all cars should be moved to the west
- When the car is driven out, rest of the cars should be moved to the left
- Vehicle data should be updated
Departure of Scooter:
- Scooters should be able to drive out at random
- Vehicle data should be updated
Note that when desired the operator must be able to obtain information like number of vehicles, number of scooters or number of cars currently parked in the parking lot. Also, the system should be able to display all the parking lots (currently occupied) if desired.
### Code:
#### CarParkManagement.java:
```
package Assignment;

public class CarParkManagement {

	public static void main(String[] args) {

		Car BMW = new Car("Z4", "red",4, "Auto",false);

		Bike Superfly = new Bike("XTR", "Black",2,true );

		Car Hyundai = new Car("i30","Light Blue",4,"Auto",true);

		CarPark myCarPark = new CarPark();

		//Parking Vehicles
		myCarPark.addVehicles(BMW);
		myCarPark.addVehicles(Hyundai);
		myCarPark.addVehicles(Superfly);

		// Comment some of the above to see if it works

		System.out.println("No. of Parked vehicles: " + myCarPark.numOfOccupiedSpots());

		System.out.println("No. of Available Spots: "+ myCarPark.numOfAvailableSpots());

		// Printing details
		System.out.println("====================\n");
		System.out.println("List of All Parked Vehicles is as folows: ");
		
		myCarPark.printParkedVehicleDetails();

	}
}
```
#### Vechile.java:
```
package Assignment;

public class Vehicle {
	
	private String model;
	private String color;
	private int numOfWheels;
	private String transmission;

	// constructor
	public Vehicle(String model, String color, int numOfWheels, String transmission){
		
		this.model = model;
		this.color = color;
		this.numOfWheels = numOfWheels;
		this.transmission = transmission;
	}
	
	// default constructor
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	// getters
	public String getModel(){
		
		return model;
	}

	public String getColor(){
		
		return color;
	}

	public int NumOfWheels(){
		
		return numOfWheels;
	}

	public String transmission(){
		
		return transmission;
	}

	// setters
	public void setNumOfWheels (int numOfWheels){
		
		this.numOfWheels = numOfWheels;
	}

	public void setModel(String model){
		
		this.model = model;
	}

	public void setColor(String color){
		
		this.color = color;
	}

	public void setTransmission(String transmission){
		
		this.transmission = transmission;
	}

	// Print Method
	public void printDetails(){
		
		System.out.println("The color of this vehicle is " + this.color);
		System.out.println("The model of this vehicle is " + this.model);
		System.out.println("The transmission for this vehicle is " + this.transmission);
		System.out.println("The number of wheels in this vehicle is "+ this.numOfWheels);
	}
}
```
#### Bike.java:
```
package Assignment;

public class Bike extends Vehicle {

	private boolean suspension;

	public Bike(){
		
		super();
	}

	public Bike(String model, String color, int numOfWheels, boolean suspension){
		
		super( model, color, numOfWheels, "na"); 
		// na for transmission as Bike class does not need a suspension property
		this.suspension = suspension;
	}

	// getter
	public boolean getSuspension(){
		
		return suspension;
	}

	// setter
	public void setSuspension(){
		
		this.suspension = suspension;
	}

	// method
	public void printBikeDetails(){
		
		super.printDetails();
		System.out.println("Does this bike have suspension ?? " + this.suspension);
	}
}
```
#### Car.java: 
```
package Assignment;

public class Car extends Vehicle{

	private Boolean roof;

	// Constructors
	public Car(){
		
		super();
	}

	public Car(String model, String color, int numOfWheels, String transmission, Boolean roof){

		super(model, color, numOfWheels, transmission);
		this.roof = roof;

	}

	// getter
	public boolean getRoof(){
		
		return roof;
	}

	// setter
	public void setRoof(boolean roof){
		
		this.roof=roof;
	}

	// Methods
	public void printdetailscar(){
		
		super.printDetails(); // Calling superclass method
		System.out.println(" does this car has a roof: " + this.roof);
	}
}
```
#### CarPark.java: 
```
package Assignment;

import java.util.ArrayList;

public class CarPark {

	private static final int maxCapacity = 3;
	private ArrayList <Vehicle>carParkArray; 
	// Every member of carParkArray will be of type Vehicle

	// constructor
	public CarPark(){

		this.carParkArray = new ArrayList<Vehicle>(maxCapacity);
		//This ensures car PArk has three vehicles max

	}

	// Method to find maximum capacity of the car park
	public static int getMaxCapacity(){
		
		return maxCapacity;
	}

	// Method to find available spots in the carpark
	public int numOfAvailableSpots(){
		
		return this.maxCapacity - this.carParkArray.size();
	}

	// Method to find number of occupied spaces in the carpark
	public int numOfOccupiedSpots(){
		
		return this.carParkArray.size();
	}

	//Method to add vehicles to the carpark
	public void addVehicles(Vehicle vehicle){

		if(this.numOfAvailableSpots() > 0){
			
			this.carParkArray.add(vehicle);
			vehicle.printDetails();
			System.out.println("++++++++++++ \n");
		
		} else {
			
			System.out.println("Car Park is full");
		}

	}
	
	//Method to print parked vehicle details
	public void printParkedVehicleDetails(){

		// For every vehicle in array carParkArray, do blah blah
		for(Vehicle vehicle: this.carParkArray){
			
			vehicle.printDetails();
			System.out.println("++++++++++++++++ \n");

		}

	}
}
```
### Code Output:
```
The color of this vehicle is red
The model of this vehicle is Z4
The transmission for this vehicle is Auto
The number of wheels in this vehicle is 4
++++++++++++ 

The color of this vehicle is Light Blue
The model of this vehicle is i30
The transmission for this vehicle is Auto
The number of wheels in this vehicle is 4
++++++++++++ 

The color of this vehicle is Black
The model of this vehicle is XTR
The transmission for this vehicle is na
The number of wheels in this vehicle is 2
++++++++++++ 

No. of Parked vehicles: 3
No. of Available Spots: 0
====================

List of All Parked Vehicles is as folows: 
The color of this vehicle is red
The model of this vehicle is Z4
The transmission for this vehicle is Auto
The number of wheels in this vehicle is 4
++++++++++++++++ 

The color of this vehicle is Light Blue
The model of this vehicle is i30
The transmission for this vehicle is Auto
The number of wheels in this vehicle is 4
++++++++++++++++ 

The color of this vehicle is Black
The model of this vehicle is XTR
The transmission for this vehicle is na
The number of wheels in this vehicle is 2
++++++++++++++++ 
```
### Code Screen Shots:
#### CarParManagement.java
![CarParManagement](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Code/CarParManagement.JPG)
#### Vechile.java
![Vechile_ss01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Code/Vechile_ss01.JPG)
![Vechile_ss02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Code/Vechile_ss02.JPG)
#### Bike.java
![Bike](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Code/Bike.JPG)
#### Car.java:
![Car](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Code/Car.JPG)
#### CarPark.java
![CarPark_ss01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Code/CarPark_ss01.JPG)
![CarPark_ss02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Code/CarPark_ss02.JPG)
#### Code Output Screen Shot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Assignment/Output/output.JPG)
___
## [Lab: 02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02.md)
### Index:
- ### [Lab-02 | Task_01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_01.md)
- ### [Lab-02 | Task_02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_02.md)
___
## [Lab-02 | Task_01](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_01.md)
Lab Tasks 1:
•	Develop Method in java which can find the smallest and the largest value from integer Array.
o	int[] TwoExtreamValue(int A[]).
•	Develop Method in java which can sort integer array using bubble sort. 
o	Int[] SortArray(int A[]).
•	Vector Multiplication Using two integer Arrays
o	int VectorMultiplication(int A[],int B[]).
### Code:
#### valueFinder.java:
```
package Task_01;

public class multiplyVector {
	
	public static int VectorMultiplication(int A[], int B[]) {
		
		int size = A.length;
		int mul = 0;
	  
		for (int i = 0; i < size; i++) {
		
			mul = mul + A[i] * B[i];
		}
	  
		return mul;
	}
}
```
#### sortArray.java:
```
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
```
#### multiplyVector.java:
```
package Task_01;

public class multiplyVector {
	
	public static int VectorMultiplication(int A[], int B[]) {
		
		int size = A.length;
		int mul = 0;
	  
		for (int i = 0; i < size; i++) {
		
			mul = mul + A[i] * B[i];
		}
	  
		return mul;
	}
}
```
#### main.java:
```
package Task_01;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		valueFinder vf = new valueFinder();
		sortArray sa = new sortArray();
		multiplyVector mv = new multiplyVector();
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[3];
		int max = 3;
				
		System.out.println("1.Value Finder (smallest/largest)\n2.Sort Array \n3.Multiply Two Vectors\nSelect your option (1, 2, 3) : ");
		double selectedOption = scan.nextDouble();
		
		if (selectedOption == 1) {
			
			System.out.println("Enter integers numbers : ");
			
			for(int i = 0; i <= max; i++) {  
				
				array[i] = scan.nextInt();  
				vf.TwoExtreamValue(array);
			}  
		}
		else if (selectedOption == 2) {

			System.out.println("Enter integers numbers Array : ");
			
			for(int i = 0; i <= max; i++) {  
				
				array[i] = scan.nextInt();  
				sa.SortArray(array);
			}  
		}
		else {
			
			System.out.println("Enter integers numbers (with 'space') : ");
			
			for(int i = 0; i <= max; i++) {  
				
				array[i] = scan.nextInt();  
				mv.VectorMultiplication(null, null);
			} 
		}
	}
}
```
### Code Output:
```
```
### Code Screen Shots:
#### valueFinder.java:
![valueFinder](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/valueFinder.JPG)
#### sortArray.java:
![sortArray](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/sortArray.JPG)
#### multiplyVector.java:
![multiplyVector](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/multiplyVector.JPG)
#### main.java:
![main.java_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/main_ss1.JPG)
![main.java_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_01/Code/main_ss2.JPG)
### Code Output Screen Shot:
![output]()
___
## [Lab-02 | Task_02](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_02_Task_01.md)
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
Generic Array <Integer>: [0, 2, 4, 6, 8]

Generic Array <String>: [a, b, c, d, e]
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_02/Code/main.JPG)
#### array.java:
![array](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_02/Code/array.JPG)
### Code Output ScreenShot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/ScreenShots/Task_02/Output/output.JPG)
___
## [Lab: 03](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-02/Readme/Lab_03.md)
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
___
## [Lab: 04](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/Readme/Lab_04.md)
Lab Tasks:
Write a program in java to insert a new node at the middle of Singly Linked List.
### Code:
#### main.java:
```
package Task;

public class main {

	
	public static void main(String[] args) {  

		InsertNode sList = new InsertNode();  
		
		sList.addNodeAtEnd(1);  
		sList.addNodeAtEnd(2); 
		sList.addNodeAtEnd(5); 
		sList.display();  
		sList.addInMid(3);  
		
		System.out.println("Updated List: ");  
		
		sList.display();  
		sList.addInMid(4);  
		
		System.out.println("Updated List: ");  
		
		sList.display();
		
		System.out.println("Updated List: "); 
		
		sList.addAtStart(0);
		sList.display();
	
	}  
}
```
#### InsertNode.java:
```
package Task;

public class InsertNode {  

	class Node {  
		
		int data;  
	    Node next;  
	
	    public Node(int data) {  
	
	    	this.data = data;  
	    	this.next = null;  
	    }  
	}
	
	public int size;   
	public Node head = null;  
	public Node tail = null;  
 
	public void addAtStart(int data) {  
	        
		Node newNode = new Node(data);  
	
		if (head == null) {  
	
			head = newNode;  
			tail = newNode;  
	    }  
		
		else {  
	            
			Node temp = head;  
	        head = newNode;   
	        head.next = temp;  
	    }  
	}   
	
	public void addNodeAtEnd(int data) {  
		
		Node newNode = new Node(data);    
	
		if(head == null) {  
	
			head = newNode;  
			tail = newNode;  
	    }  
	
		else {  
			
			tail.next = newNode;  
			tail = newNode;  
	    }  
	
		size++;  
	}    
	
	public void addInMid(int data) {  
	
		Node newNode = new Node(data);  
	
		if(head == null) {  
	
			head = newNode;  
			tail = newNode;  
	    }  
		
		else {  
	
			Node temp, current;  
			int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
			temp = head;  
			current = null;  
	
			for(int i = 0; i < count; i++) {  
	
				current = temp;  
				temp = temp.next;  
	        }  
	
			current.next = newNode;  
			newNode.next = temp;  
	    }  
	
		size++;  
	}   
	
	public void display() {  
	
		Node current = head;  
	
		if(head == null) {  
	
			System.out.println("List is empty");  
			return;  
	    }  
	
		while(current != null) {    
	
			System.out.print(current.data + " ");  
			current = current.next;  
	    }  
	
		System.out.println();  
	}
}
```
### Code Output:
```
```
### Code Screen Shot:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/main.JPG)
#### InsertNode.java:
![InsertNode_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/InsertNode_ss1.JPG)
![InsertNode_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/InsertNode_ss2.JPG)
![InsertNode_ss3](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Code/InsertNode_ss3.JPG)
#### Code Output Screen Shot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-04/ScreenShots/Output/output.JPG)
___
## [Lab: 05](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05.md)
### Index:
- ### [Lab-05 | Task_01 part a](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05_Task_01_a.md)
- ### [Lab-05 | Task_01 part b](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05_Task_01_b.md)
___
## [Lab: 05 | Task_01 part a](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05_Task_01_a.md)
Lab Tasks 1:
(a). Calculate power of a given number in java
### Code:
#### main.java:
```
package Task_a;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		power pp = new power();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = scan.nextInt();
     
		System.out.print("Enter power:");
		int pow = scan.nextInt();
		
		float power = pp.power(num,pow);
     
		if(pow > 0) {
     
			int p = (int) power;
			System.out.print(num+"^"+pow+" = "+p);
		}
     
		else {
     
			System.out.print(num+"^"+pow+" = "+power);
		}
	}
}
```
#### power.java:
```
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
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_a/Code/main.JPG)
#### power.java:
![power](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_a/Code/power.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_a/Output/output.JPG)
___
## [Lab: 05 | Task_01 part b](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/Readme/Lab_05_Task_01_b.md)
Lab Tasks 1:
(b). Reverse a String using recursion in Java
### Code:
#### main.java:
```
package Task_b;

import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		
		reverse r = new reverse();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter String:");
	    
		String str = scan.nextLine();
	    String rev = r.reverse(str);
	
	    System.out.print("Reverse String is: "+rev);
	}
}
```
#### reverse.java:
```
package Task_b;

public class reverse {

	public static String reverse(String s) {
	
		if (s.isEmpty())
	
			return s;
	
		return reverse(s.substring(1)) + s.charAt(0);
	}
}
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_b/Code/main.JPG)
#### reverse.java:
![reverse](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_b/Code/reverse.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-05/ScreenShots/Task_b/Output/output.JPG)
___
## [Lab: 06](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/Readme/Lab_06.md)
Lab Tasks:
Implement Stack using Linked List.
### Code:
#### main.java:
```
package Task;

public class main {
	
	public static void main(String args[]) {
		
        stack_using_linkedList lls = new stack_using_linkedList();
        
        lls.push(20);
        lls.push(50);
        lls.push(80);
        lls.push(40);
        lls.push(60);
        lls.push(75);
        
        System.out.println("Element removed from LinkedList: "+lls.pop());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        
        lls.push(10);
        
        System.out.println("Element removed from LinkedList: "+lls.pop());
        
        lls.printList(lls.head);
    }
}
```
#### stack_using_linkedList.java:
```
package Task;

public class stack_using_linkedList {
	
	public Node head; 
    
	public class Node {
        
		int value;
        Node next;
    }
 
    public stack_using_linkedList() {
        
    	head = null;
    }
    
    public int pop() throws LinkedListEmptyException {
        
    	if (head == null) {
            
    		throw new LinkedListEmptyException();
        }
        
    	int value = head.value;
        head = head.next;
        return value;
    }
    
    public void push(int value) {
        
    	Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }
 
    public static void printList(Node head) {
        
    	Node temp = head;
        
    	while (temp != null) {
            
    		System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        
    	System.out.println();
    }
}
```
#### LinkedListisEmptyException.java:
```
package Task;

public class LinkedListEmptyException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;
 
    public LinkedListEmptyException() {
        
    	super();
    }
 
    public LinkedListEmptyException(String message) {
        
    	super(message);
    }
}
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/main.JPG)
#### stack_using_linkedList.java:
![stack_using_linkedList_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/stack_using_linkedList_ss1.JPG)
![stack_using_linkedList_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/stack_using_linkedList_ss2.JPG)
#### LinkedListEmptyException.java:
![LinkedListEmptyException](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Code/LinkedListEmptyException.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-06/ScreenShots/Task/Output/output.JPG)
___
## [Lab: 07](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/Readme/Lab_07.md)
Task 1:
Write a java program to sort the array by using bubble sort and selection sort.
### Code:
#### main.java:
```
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
```
#### BubbleSort.java:
```
package Task;

public class BubbleSort {
	 
    public static void bubbleSort(int[] arr) {  
        
    	int n = arr.length;  
        int temp = 0;  
        
        for(int i=0; i < n; i++) {  
        
        	for(int j=1; j < (n-i); j++) {  
            
        		if(arr[j-1] > arr[j]) {  
                 
        			temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
        		}  
        	}   
        }   
    }
}
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/ScreenShots/Task/Code/main.JPG)
#### BubbleSort.java:
![BubbleSort](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/ScreenShots/Task/Code/BubbleSort.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-07/ScreenShots/Task/Output/output.jpg)
___
## [Lab: 08](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-08/Readme/Lab_08.md)
```diff
- No Task & Assignment in Lab-08.
```
___
## [Lab: 09](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/Readme/Lab_09.md)
Task # 1: 
Implement Pre-order traversal in java.
### Code:
#### main.java:
```
package Task;

public class main {
	
	public static void main(String[] args) {
	    
		Tree tree = new Tree();
	
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
	
		System.out.println("\nPreorder traversal ");
	
		tree.preorder(tree.root);
	}
}
```
#### Node.java:
```
package Task;

public class Node {
	
	int item;
	Node left, right;
	
	public Node(int key) {
	
		item = key;
		left = right = null;
	}
}
```
#### Tree.java:
```
package Task;

public class Tree {
	
	Node root;
	
	Tree() {
	
		root = null;
	}
	
	void preorder(Node node) {
	
		if (node == null)
	
			return;
	    System.out.print(node.item + "->");
	    preorder(node.left);
	    preorder(node.right);
	}
}
```
### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Code/main.jpg)
#### Node.java:
![Node](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Code/Node.jpg)
#### Tree.java:
![Tree](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Code/Tree.jpg)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-09/ScreenShots/Task/Output/output.png)
___
## [Lab: 10](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-10/Readme/Lab_10.md)
```diff
- No Task & Assignment in Lab-10.
```
___
## [Lab: 11](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/Readme/Lab_11.md)
Lab Tasks:
Implement a binary search tree and AVL tree from the following traversals:
{15, 5, 20, 70, 3, 10, 60, 90, 16}
•	Write a method that search 15 but your tree should be BST and AVL after deletion
•	Write a method to Reverse path of Binary Search Tree.
### Code:
#### main.java:
```
package task;

import task.ConvertBTtoBST.Node;

public class main {
	
	public static void main(String[] args) {  

		ConvertBTtoBST bt = new ConvertBTtoBST(); 
		
		bt.root = new Node(15); 
		bt.root.left = new Node(5);
		bt.root.right = new Node(20);
		bt.root.left.left = new Node(70); 
		bt.root.left.right = new Node(3);
		bt.root.right.left = new Node(10);
		bt.root.right.right = new Node(60); 
		bt.root.right.right.left = new Node(90); 
		bt.root.right.right.right = new Node(16); 

		System.out.println("Inorder representation of binary tree: ");  
		
		bt.inorderTraversal(bt.root);  

		Node bst = bt.convertBTBST(bt.root);  

		System.out.println("\nInorder representation of resulting binary search tree: ");  
		
		bt.inorderTraversal(bst);  
	}  
}
```
#### ConvertBTtoBST.java:
```
package task;

import java.util.Arrays;  

public class ConvertBTtoBST {  
	
	public static class Node{

		int data;  
        Node left;  
        Node right;  


        public Node(int data){  

        	this.data = data;  
        	this.left = null;  
        	this.right = null;  
        }  
	}  

	public Node root;  

	int[] treeArray;  
	int index = 0;  

	public ConvertBTtoBST() {  

		root = null;  
    }  


	public Node convertBTBST(Node node) {  

		int treeSize = calculateSize(node);  
		treeArray = new int[treeSize];  

		convertBTtoArray(node);  

		Arrays.sort(treeArray);  
        Node d = createBST(0, treeArray.length -1);  

        return d;  
    }  

	public int calculateSize(Node node) {  

		int size = 0;  

		if (node == null)  

			return 0;  

		else {  

			size = calculateSize (node.left) + calculateSize (node.right) + 1;  

			return size;  
        }  
    }  

	public void convertBTtoArray(Node node) {  

		if(root == null) {  

			System.out.println("Tree is empty");  
			
			return;  
        }  

		else {  

			if(node.left != null)  

				convertBTtoArray(node.left);  
				treeArray[index] = node.data;  
				index++;  

				if(node.right != null)  

					convertBTtoArray(node.right);  
        }  
	}  

	public Node createBST(int start, int end) {  

		if (start>end) {  

			return null;  
        }  

		int mid = (start + end) / 2;  
        Node node = new Node(treeArray[mid]);  


        node.left = createBST(start, mid - 1);  
        node.right = createBST(mid + 1, end);  

        return node;  
    }  

	public void inorderTraversal(Node node) {  

		if(root == null) {  

			System.out.println("Tree is empty");  

			return;  
        }  
		else {  

			if(node.left!= null)  

				inorderTraversal(node.left);  
				System.out.print(node.data + " ");  

				if(node.right!= null)  

					inorderTraversal(node.right);  
        }  
	}  
}
```

### Code Output:
```
```
### Code ScreenShots:
#### main.java:
![main](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/main.JPG)
#### ConvertBTtotBST.java:
![ConvertBTtotBST_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss1.JPG)
![ConvertBTtotBST_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss2.JPG)
![ConvertBTtotBST_ss3](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss3.JPG)
![ConvertBTtotBST_ss4](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Code/ConvertBTtotBST_ss4.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-11/ScreenShots/Task/Output/output.JPG)
___
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
#### ConvertBTtotBST.java:
![HashTable_ss1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss1.JPG)
![HashTable_ss2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss2.JPG)
![HashTable_ss3](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss3.JPG)
![HashTable_ss4](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss4.JPG)
![HashTable_ss5](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Code/HashTable_ss5.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-12/ScreenShots/Task/Output/output.JPG)
___
## [Lab: 13](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-13/Readme/Lab_13.md)
Lab Tasks:
•	Implement a method remove(s) that removes a value from hashmap.
•	Implement a method isempty() that returns a boolean value a that checks whether the hash map is empty or not.
•	Implement a method clear() that removes all values from the hashmap. 
### Code:
#### Hashing.java:
```
package Task;

import java.util.*; 

public class Hashing { 
	
	public static void main(String[] args) { 
		
		HashSet<Integer>A = new HashSet<Integer>(); 

		A.add(1); 
		A.add(2); 
		A.add(3); 

		System.out.println(A);

		if(A.isEmpty()) {
			
			System.out.println("HashSet is empty");
		}

		else {

			System.out.println("HashSet is not empty");
		}
		
		A.clear();

		System.out.println("Removed all elements");
	}
}
```

### Code Output:
```
```
### Code ScreenShots:
#### Hashing.java:
![Hashing](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-13/ScreenShots/Task/Code/Hashing.JPG)
### Code Output ScreenShots:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-13/ScreenShots/Task/Output/output.JPG)
___
## [Lab: 14](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-14/Readme/Lab_14.md)
```diff
- No Task & Assignment in Lab-14.
```
___