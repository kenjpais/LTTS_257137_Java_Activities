
public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected String fuelCapacity;
	protected int cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, String fuelCapacity,int cc) {
		this.cc = cc;
		this.vehicleNumber=vehicleNumber;
		this.fuelCapacity = fuelCapacity;
		this.fuelType = fuelType;
		this.make= make;	
	}
	
	public void displayMake() { System.out.println(this.make);}
	
	public void displayBasicInfo(){System.out.println(this.vehicleNumber+" "+this.fuelCapacity+" "+ this.cc+"  "+this.fuelType);}
	
	public void displayDetailInfo() {}
}
