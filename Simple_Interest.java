import java.io.*;
import java.util.*;
class simple_interest
{
	public static void main(String args[])
	{
		double p,t,r,si;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter principle amount: ");
		p = sc.nextDouble();
		System.out.printf("Enter time period: ");
		t = sc.nextDouble();
		System.out.printf("Enter rate of interest: ");
		r = sc.nextDouble();
		si=(p*t*r)/100;
		System.out.printf("\nThe Simple Interest is: "+si);
	}
}
