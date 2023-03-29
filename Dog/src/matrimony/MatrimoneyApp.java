package matrimony;
import java.util.*;
class InvalidAge extends Exception
{
	public String getMessage18()
	{
		return "YOU are under aged, try other age ";
	}
	public String getMessage50()
	{
		return "YOU are over 50, try other age";
	}
	
}






 class App
{
	 int age;
	Scanner scan=new Scanner(System.in);
	public void takeInput()
	{
	System.out.println("connection 3 established");
	System.out.println("enter your age");
    age=scan.nextInt();
	}
	
	public void verify() throws Exception
	{
		
		if(age<=18)
		{
			InvalidAge ia=new InvalidAge();
			System.out.println(ia.getMessage18());
			throw ia;
		}
		
		if(age>=50)
		{
			InvalidAge ia1=new InvalidAge();
			System.out.println(ia1.getMessage50());
			throw ia1;
		}
		else
		{
			System.out.println("you are eligible for marriage");
		}
		System.out.println("connection 3 terminated");
	}
	
}


class Matrimoney
{
	
	public void initiate()
	{
		System.out.println("connection 2 established");
	App a=new App();
	
	try
	{
		a.takeInput();
	a.verify();
	}
	catch(Exception e)
	{
		try
		{
			System.out.println("2nd chance enter correct age");
			a.takeInput();
			a.verify();
		}
		catch(Exception e1)
		{
			try
			{
			System.out.println("last chance to enter correct age");
			a.takeInput();
			a.verify();
			}
			catch(Exception e2)
			{
				System.out.println("you have tried 3 times, no marrige opyions avaliable for you");
			}
		}
	}
	finally
	{
		System.out.println("connection 2 terminated");
	}
	
	}
}


public class MatrimoneyApp {

	public static void main(String[] args) {
		System.out.println("connection 1 established");
		Matrimoney m=new Matrimoney();
		m.initiate();
		System.out.println("connection 1 terminated");
 }

}
