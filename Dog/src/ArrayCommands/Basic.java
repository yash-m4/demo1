package ArrayCommands;
import java.util.*;
public class Basic {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter no. of Schools");
		 int a=scan.nextInt();
		 int arr[][][]=new int[a][][];
		 for(int x=0; x<=arr.length-1;x++)
		 {
			System.out.println("enter no. of classes for school "+x);
			int b=scan.nextInt();
			arr[x]=new int[b][];
		 
		}
		 
		 for(int z=0; z<=arr.length-1;z++)
		 {
			 for(int k=0; k<=arr[z].length-1; k++)
			 {
				 System.out.println("enter no. of students for school "+z+" of class "+k);
					int c=scan.nextInt();
					arr[z][k]=new int[c]; 
				 
			 }
			 
			 
		 }
		 
		 for(int g=0; g<=arr.length-1; g++)
		 {
			 for(int h=0; h<=arr[g].length-1; h++)
			 {
				 for(int i=0; i<=arr[g][h].length-1; i++)
				 {
					 System.out.println("enter marks of student"+i+" of class "+h+" of chool "+g);
						
						arr[g][h][i]=scan.nextInt();
					 
					 
				 }
				 
				 
			 }
		 }
		 

		 for(int g=0; g<=arr.length-1; g++)
		 {
			 for(int h=0; h<=arr[g].length-1; h++)
			 {
				 for(int i=0; i<=arr[g][h].length-1; i++)
				 {
					 System.out.println("marks of Student " +i+ " of class "+h+" of school" +g+" is "+arr[g][h][i]);
						
					 
				 }
				 
				 
			 }
		 }
		 
		 
	}
}

