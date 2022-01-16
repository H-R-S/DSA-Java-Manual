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
