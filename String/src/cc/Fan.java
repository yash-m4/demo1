package cc;

public class Fan {
 
	 public void fun()
	 {
		 int n=5;
		 System.out.println(n);
	 }
	public void ff()
	{
		Fan f=new Fan();
		f.fun();
	}
}



class FanApp
{
	public static void main(String [] args)
	{
		Fan f2=new Fan();
		f2.ff();
		
		
		
	}
}