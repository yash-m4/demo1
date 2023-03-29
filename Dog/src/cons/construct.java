package cons;

public class construct {
private int age;
private String name;
	public construct(int age, String name)
	{
		if(age>=1)
		{
			this.age=age;
		}
		else
		{
			
		}
		
		if(name=="om")
		{
			this.name=name;
		}
		
		else {
			
		}
		
		
		
	}
	
	public construct()
	{
		
	}	
	
	
	public int getage()
	{
		return age;
	}
	public String getname()
	{
		return name;
	}
	
	
}
 class constructApp
 {
	 public static void main(String [] args)
	 {
		 construct cn=new construct(12, "om");
		 
		 System.out.println(cn.getage());
		 System.out.println(cn.getname());
		 
		 
		 construct cn2=new construct();
		 System.out.println(cn2.getage());
		 System.out.println(cn2.getname());
	 }
 }