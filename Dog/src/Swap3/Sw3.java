package Swap3;

import java.util.Scanner;

public class Sw3 {
	
	
	
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int a;
		
		System.out.println(" enter length of array");
		a=scan.nextInt();
		
		int arr1[]=new int[a];
		
		System.out.println(" enter the elements of array");
		
		for(int x=0; x<=arr1.length-1; x++)
		{
			System.out.println(" enter " +x+ " element ");
			arr1[x]=scan.nextInt();
		}
		
	
		
int arr2[]=new int[arr1.length];


int k=arr2.length-1;



		for(int y=0; y<=arr1.length-1; y++)
		{
			arr2[k]=arr1[y];
	k--;
	
		
		}
		
		for(int z=0; z<= arr1.length-1; z++)
		{
			System.out.println(arr1[z]+" and "+arr2[z]);
			
		}
		
}
}
