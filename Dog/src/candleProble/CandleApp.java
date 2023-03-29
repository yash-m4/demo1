package candleProble;
import java.util.*;


public class CandleApp {

	public static void main(String[] args) {
		
		Sort s=new Sort();
		int brr[]=s.bb();
		
		Candle can=new Candle();
		int frr[]=can.cc(brr);
		System.out.println(frr.length);
	}

}





 class Sort
{
	public int[] bb()
	{
Scanner scan =new Scanner(System.in);
		
		System.out.println("enter no. of candles");
		int a=scan.nextInt();
		
		int arr[]=new int[a];
		
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("enter height of candle no. " +i);
			int b=scan.nextInt();
			arr[i]=b;
		}
		  int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++)
	         {  
	                 for(int j=1; j < (n-i); j++)
	                 {  
	                          if(arr[j-1] > arr[j])
	                          {  
	                        	  //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                        	  }
		

	}
	                          
 
}
	
	         
	         
	         return arr;
	         }
 
	         }
	
 
 class Candle
 {
	 public int[] cc(int crr[])
	 {
		 int max=crr[crr.length-1];
		 
		 int drr[]=new int[crr.length];
		 
		 int j=0;
		 for(int i=0;i<=crr.length-1; i++)
		 {
			 if(crr[i]==max)
			 {
				 drr[j]=crr[i];
				 j++;
			 }
			 
			 else
			 {
				 
			 }
			 
			 
		 }
		 
		String S=Arrays.toString(drr) ;
		S=S.replace(" ","");
	
		char err[]=S.toCharArray();
		
		int grr[]=new int[err.length];
	
	int g=0;
	for(int i=0; i<=err.length-1; i++)
	{
		grr[g]=err[i];
		g++;
		
	}
	System.out.println(grr);
		
		 return grr;
	
	 }

 }

 