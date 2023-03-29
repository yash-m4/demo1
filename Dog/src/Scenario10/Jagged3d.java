package Scenario10;
import java.util.*;

public class Jagged3d {

	public static void main(String[] args) {
	
Scanner scan=new Scanner(System.in);
		int arr[][][]=new int[3][][];
		
		arr[0]=new int[3][];
		arr[1]=new int[2][];
		arr[2]=new int[4][];
		
		
	arr[0][0]=new int[2];
	arr[0][1]=new int[3];
	arr[0][2]=new int[2];
		
	arr[1][0]=new int[5];
	arr[1][1]=new int[2];	
	
	arr[2][0]=new int[2];
	arr[2][1]=new int[4];	
	arr[2][2]=new int[2];
	arr[2][3]=new int[5];
	
		
	for(int x=0; x<=arr.length-1; x++)
	{
		
		for( int y=0; y<=arr[x].length-1; y++)
		{
			
			for(int z=0; z<=arr[x][y].length-1; z++)
			{
				
				System.out.println("Enter Salary Of employee " +z+ " of company "+x+ " of branch "+y);
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
				
				System.out.println("Salary of Employee " +z+" of company "+x+ " of branch " +y+" is "+arr[x][y][z]);
				
				
				
			}
			
		}
	}
	
	
	
		
		
		
		
		
		
		
	}

}
