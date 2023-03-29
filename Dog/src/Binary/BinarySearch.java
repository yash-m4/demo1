package Binary;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int x;
		int key;
		x=scan.nextInt();	
		int arr[]=new int[x];
		
		System.out.println("Enter Contents of array");
		
		for(int y=0; y<=arr.length-1; y++)
		{
			System.out.println("Enter "+y+" element");	
			arr[y]=scan.nextInt();
			
		}
		
		System.out.println("Enter Key to Search");
		key=scan.nextInt();
		
		int high=arr.length-1;
		int low=0;
		int mid=(high+low)/2;
	
		
	
		while (low<=high)
		{
			
		if (key== arr[mid])
		{
			System.out.println("key found at mid " +mid);
			System.exit(0);
		}
		else if (key>arr[mid])
		{
			low=mid+1;
			high=high;
			
		}
		else
		{
			high=mid-1;
			low = low;
			
		}
			
			
		}	
			
			System.out.println("Key not found");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}


