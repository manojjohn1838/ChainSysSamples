
public class Bike {
	
	public String type;
	public  int noOfWheels;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public void setMode()
	{
		System.out.println("Not yet Decided");
	}
	public void maxSpeed()
	{
		System.out.println("Not yet Known"); 
	}
	public Bike(String type, int noOfWheels) {
		super();
		this.type = type;
		this.noOfWheels = noOfWheels;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
