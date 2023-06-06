import java.io.*;
import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		int i,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.printf("The factorial of "+num);
		System.out.printf(" is: "+fact);
	}
}
