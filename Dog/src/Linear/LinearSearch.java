package Linear;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int a;
		
		System.out.println(" enter length of array");
		a=scan.nextInt();
		
		int arr1[]=new int[a];
		int key;
		
		System.out.println(" enter the elements of array");
		
		for(int x=0; x<=arr1.length-1; x++)
		{
			System.out.println(" enter " +x+ " element ");
			arr1[x]=scan.nextInt();
		}
		
		
		System.out.println("enter no. to search");
		
		
		key=scan.nextInt();
		
		for(int x=0; x<=arr1.length-1; x++)
		{
			if(key==arr1[x])
			{
				System.out.println(" key found at index" +x);
				System.exit(0);
				
			}
				
		}
		
		System.out.println("Key not found");
		
		
		
	}

}
