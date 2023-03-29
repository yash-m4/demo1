package S2;

public class S2 {
public static void main(String []args)
{
	String s1=new String("raju");
	String s2="RAJU";
	
	if(s1==s2)
	{
		System.out.println(" refference elements are same");
	}
	else
	{
		System.out.println(" refference elements are not same");
	}
	
	
	if(s1.equals(s2))
	{
		System.out.println(" contents are same");
	}
	else
	{
		System.out.println(" contents are not same");
	}
	
	
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println(" contents are same");
	}
	else
	{
		System.out.println(" contents are not same");
	}
	
	
	
	
	
	
}
}
