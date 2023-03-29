package hello;

abstract class Animal
{
 abstract void noise();
	
	
	
}

class Pig extends Animal
{
	void noise() {
	System.out.println("wee");
	}
}



public class Hello {
	public static void main(String args[])
	{
		Pig p=new Pig();
		p.noise();
		
			
				
				
		
		
		
	}
	
	
	
	
}
