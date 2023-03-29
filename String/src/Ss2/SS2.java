package Ss2;
import java.util.*;

public class SS2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter sentance");
		String a=scan.nextLine();
		StringBuilder b=new StringBuilder();
		b.append(a);
		b.reverse();
		String c=new String(b);
		System.out.println(c);
		String d[]=c.split(" ");
		for(int i=d.length-1; i>=0; i--)
		{
			System.out.print(d[i]);
			System.out.print(" ");
		}
		
	
		
	}
	}

