package treeset;
import java.util.*
;
import java.util.Collections;

class Employe implements Comparable
{
	int id;
	String name;
	
	public Employe(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+"  "+name;
	}
	
	public int compareTo(Object y) {
		
		if(this.name.compareTo(((Employe)(y)).name)>0)
		{
			return 1;
		}
		return -1;
	}
}
 




public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employe e1=new Employe(10,"ramu");
Employe e2=new Employe(9,"raju");
Employe e3	=new Employe(13,"ramesh");
Employe e4=new Employe(12,"rajesh");

TreeSet<Employe> ts=new TreeSet<Employe>();

ts.add(e1);
ts.add(e2);
ts.add(e3);
ts.add(e4);
System.out.println(ts);

	}

}
