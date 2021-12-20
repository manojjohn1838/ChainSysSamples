
public class Tvs extends Bike
{
	private double topSpeed;
	private int Bcc;
	private double targue;
	private String mode;
	
	
	
	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getBcc() {
		return Bcc;
	}

	public void setBcc(int bcc) {
		Bcc = bcc;
	}

	public double getTargue() {
		return targue;
	}

	public void setTargue(double targue) {
		this.targue = targue;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public void extraFeatures()
	{
		System.out.println("Tvs has not enough features");
	}

	public Tvs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tvs(String type,int noOfWheels,double topSpeed, int bcc, double targue, String mode) {
		//super(type,noOfWheels);
		super();
		this.topSpeed = topSpeed;
		Bcc = bcc;
		this.targue = targue;
		this.mode = mode;
	}
	

}
