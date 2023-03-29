package Scenario5;
import java.util.*;

public class Arr5 {

	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter contents of array");
			for(int i=0; i<=arr.length-1; i++)
			{
				System.out.println(i+" element is?");
				arr[i]=scan.nextInt();			
			}
			
			
			int help;
			System.out.println("array before sorting");
			
			for(int i=0; i<=arr.length-1; i++)
			{
				System.out.println( arr[i]);
						
			}
		
			for (int y=0; y<=arr.length-2; y++)
			{
				for (int z=0; z<=arr.length-2-y; z++)
				{
					if (arr[z]>arr[z+1])
					{
						help=arr[z];
						arr[z]=arr[z+1];
						arr[z+1]=help;
					
					}
					
					
					
				}
			}
			
			
System.out.println("array after sorting");
			
			for(int i=0; i<=arr.length-1; i++)
			{
				System.out.println( arr[i]);
						
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
			System.out.println(arr.length);
		
	}
}
