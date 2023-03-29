package en;

public class Encapsule {
private int age;
private String name;

public void setdata(int a,String s)
{
	if (a>=1)
	{
		age=a;
	}
	else
	{
		System.out.println("invalid age");
	}
	
	if (s=="om")
	{
		name=s;
	}
	else
	{
		System.out.println("invalid name");
	}
}
public void getage()
{
	System.out.println(age);
}



public void getname()
{
	System.out.println(name);
}
}
class obj
{
	public static void main(String [] args)
	{
		Encapsule en=new Encapsule();
		en.setdata(2,"om");
		en.getage();
		en.getname();
		
		
	}
}


