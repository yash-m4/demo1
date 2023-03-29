package Array1;
import java.util.*;
public class Ar1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
	int n=scan.nextInt();
	int arr[]=new int[n];
	
	System.out.println("enter contents of array");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(i+" element is?");
			arr[i]=scan.nextInt();			
		}
		
		System.out.println("enter key to search");
		int key=scan.nextInt();
		int low=0;
		int high=arr.length-1;
		
		
		while (low<=high)
		{
			int mid= (low+high)/2;
			
			if (key == arr[mid])
					{
				
				System.out.println("key found at mid " +mid);
				System.exit(0);
				
					}
			
			else if( key > arr[mid])
			{
				low= mid+1;
				high=high;
				
			}
			
			else
			{
				high=mid-1;
				low=low;
				
				
			}
			
			
		}
		
		
		
		
		
		System.out.println("key not found");
		
		
	}

}
