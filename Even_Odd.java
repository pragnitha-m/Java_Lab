import java.io.*;
import java.util.*;
class even_odd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.printf(n+" is an even number");
		}
		else
		{
			System.out.printf(n+" is an odd number");
		}
	}
}
