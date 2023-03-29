package abs;
import java.util.*;
abstract class Shape
{
	double area;
	abstract public void takeInput();
	abstract public void computeA();
	public void DispA()
	{
		System.out.println("Area is"+area);
		
	}
}

 class Circle extends Shape
{
	Scanner scan=new Scanner(System.in);
	int radius;
	public void takeInput()
	{
		System.out.println("enter radius of circle");
		radius=scan.nextInt();
	}
	public void computeA()
	{
		area=(3.14*radius*radius);
	}
	
	
}


 class Square extends Shape
{
	Scanner scan=new Scanner(System.in);
	int length;
	public void takeInput()
	{
		System.out.println("enter length of square");
		length=scan.nextInt();
	}
	public void computeA()
	{
		area=(length*length);
	}
	
	
}


class ShapeApp
{
	public static void IS(Shape s)
	{
		s.takeInput();
		s.computeA();
		s.DispA();
	}
}








public class App {

	public static void main(String[] args) {
		
		
		ShapeApp.IS(new Circle());
		ShapeApp.IS(new Square());
		

	}

}
