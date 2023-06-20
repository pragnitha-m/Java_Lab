import java.io.*;
import java.util.*;
class add_array 
{
	public static void main(String[] args)
  {
    		int n,i,sum=0;		
		    Scanner sc=new Scanner(System.in);
		    System.out.printf("Enter the number of elements in the array: ");
		    n=sc.nextInt(); 
		    int arr[]=new int[n];
		    System.out.println("Enter elements of the array: ");  
		    for(i=0;i<n;i++)  
		    {   
			    arr[i]=sc.nextInt();  
		    }  
        for (i = 0; i < arr.length; i++)
          sum += arr[i];
        System.out.println("Sum of given array is "+sum);
  }
}
