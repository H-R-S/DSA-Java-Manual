# Data Structure & Algorithm Manual Lab: 01 (Solved)
### Index:
- ### [Lab-01 | Task]()
- ### [Lab-01 | Assignment]()
___
## [Lab: 01 | Task]()
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
```
___
## [Lab: 01 | Assignment]()
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
```