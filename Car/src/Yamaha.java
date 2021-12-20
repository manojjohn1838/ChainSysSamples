
public class Yamaha extends Bike {
	double topSpeed;
	int Bcc;
	double targue;
	String mode;
	
	public void extraFeatures()
	{
		System.out.println("Yamaha name is more than enough");
	}

	public Yamaha(String type, int noOfWheels, double topSpeed, int bcc, double targue, String mode) {
		super(type, noOfWheels);
		this.topSpeed = topSpeed;
		Bcc = bcc;
		this.targue = targue;
		this.mode = mode;
	}

	
	
}
