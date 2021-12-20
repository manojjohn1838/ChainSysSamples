package req2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		try
		{
		System.out.println("Enter name:");
		String name=scan.nextLine();

		System.out.println("Enter age:");
		int age=Integer.parseInt(scan.nextLine());
		if(age <18)
		{
			 throw new UnderAgeException();
		}
		
		System.out.println("enter email");
		String email=scan.nextLine();
		}
		catch(UnderAgeException e)
		{
		System.out.println(e.getMessage());	
		}
		System.out.println("Normal flow");

	}

}
