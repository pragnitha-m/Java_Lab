import java.io.*;
import java.util.*;
  
class compound_interest
{
	public static void main(String args[])
    	{
        	double principal,rate,time,CI;
        	Scanner sc = new Scanner(System.in);
		      System.out.printf("Enter principle amount: ");
		      principal = sc.nextDouble();
		      System.out.printf("Enter time period: ");
		      time = sc.nextDouble();
		      System.out.printf("Enter rate of interest: ");
		      rate = sc.nextDouble();
  		    CI = (principal*(Math.pow((1+rate/100),time)))-principal;
        	System.out.println("\nThe Compound Interest is "+ CI);
      }
}
