package basic2;
import java.util.*;

public class Basic2 {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no. of companies");
	int a=scan.nextInt();
	int arr[][][]=new int[a][][];
	
	for(int i=0; i<=arr.length-1; i++)
	{
		System.out.println("enter no. of branches in copany"+i);
		int b=scan.nextInt();
		arr[i]=new int[b][];
		}
	
	for(int i=0; i<=arr.length-1; i++)
	{
		for(int y=0; y<=arr[i].length-1; y++)
		{
			System.out.println("enter no. of employees of company"+i+" and branch"+y);
			int c=scan.nextInt();
			arr[i][y]=new int[c];
			
		}
		
	}
	
	for(int i=0; i<=arr.length-1; i++)
	{
		for(int y=0; y<=arr[i].length-1; y++)
		{
	for(int z=0; z<=arr[i][y].length-1;z++)
	{
		System.out.println("enter salary of employees "+z+" of company "+i+" and branch"+y);
		arr[i][y][z]=scan.nextInt();
	
	}
		}
	}
	
	
	
	
	for(int i=0; i<=arr.length-1; i++)
	{
		for(int y=0; y<=arr[i].length-1; y++)
		{
	for(int z=0; z<=arr[i][y].length-1;z++)
	{
		System.out.println("salary of employees "+z+" of company "+i+" and branch"+y+" is "+arr[i][y][z]);
		
	
	}
		}
	}
	
	
	
	
}
}
