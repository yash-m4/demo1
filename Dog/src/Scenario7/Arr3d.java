package Scenario7;
import java.util.*;
public class Arr3d {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	int arr[][][]=new int[3][2][4];
	
	for(int x=0; x<=arr.length-1; x++)
	{
		for( int y=0; y<=arr[x].length-1; y++)
		{
			for(int z=0; z<=arr[x][y].length-1; z++)
			{
				System.out.println("Enter the balance for Bank no. "+x+ " branch no. "+y+ " And Customer no. " +z);
				arr[x][y][z]=scan.nextInt();
				
			}
		}
	}
	
	
	
	
	for(int x=0; x<=arr.length-1; x++)
	{
		for( int y=0; y<=arr[x].length-1; y++)
		{
			for(int z=0; z<=arr[x][y].length-1; z++)
			{
				System.out.println("bank balance of Customer no. "+z+ "of bank "+x+ " of branch "+y+" is "+arr[x][y][z]);
				
				
				
			}
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
