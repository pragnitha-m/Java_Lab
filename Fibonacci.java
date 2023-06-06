import java.io.*;
import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of numbers in the fibonacci series: ");
		int count=sc.nextInt();
		System.out.printf(n1+" "+n2);
		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.printf(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
