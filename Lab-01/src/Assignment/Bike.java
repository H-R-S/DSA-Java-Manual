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
