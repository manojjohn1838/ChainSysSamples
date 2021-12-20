package req2;

public class UnderAgeException extends Exception 
{
	
	public void showMessage()
	{
		System.out.println("User age under 18");
	}
	@Override
	public String getMessage()
	{
		return "Under Age";
		
	}

}
