import java.io.*;
import java.util.*;
class leap_year
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int y = sc.nextInt();
		if(y%4==0)
		{
			System.out.printf(y+" is a leap year");
		}
		else
		{
			System.out.printf(y+" is not a leap year");
		}
	}
}
