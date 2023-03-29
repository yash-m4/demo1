package methods;
import java.util.*;

public class Math {
	int add(int x,int y)
	{
		int c=x+y;
		return c;
		
	}
	int display(int x, int y)
	{
	Sub s=new Sub();
	return s.substract(x, y);
	}
	class Sub
	{
		int substract(int x, int y)
		{
			int d=x-y;
			return d;
			
		}
	}
	

}
class MathApp
{
	public static void main(String []args)
	{
		
	
	Scanner scan=new Scanner(System.in);
	
	Math m=new Math();
	
	
	System.out.println("enter First no.");
	int a=scan.nextInt();
	
	System.out.println("enter 2nd no.");
	int b=scan.nextInt();
	
	int x=m.add(a,b);
	
	System.out.println(x);
System.out.println("Subtract method "+m.display(6, 7));
	
	}
}