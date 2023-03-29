package Scenario2;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[4][3];
		
		for(int x=0; x<=arr.length-1; x++)
		{
		for(int y=0; y<=arr[x].length-1;++y)
		{
			System.out.println("company no."+x+" employee no.s salary" +y);
			arr[x][y]=scan.nextInt();
		}
		}
		for(int z=0; z<=arr.length-1; z++)
		{
		for(int a=0; a<=arr[z].length-1;++a)
		{
			System.out.println("salarys are"+arr[z][a]);
			
		}
		
			
		}
			
		}
	}

		
		
		
		

	


