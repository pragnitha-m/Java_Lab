import java.io.*;
import java.util.*;
class circle
{
	public static void main(String args[])
	{
		double area,circum;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the radius of circle: ");
		double r=sc.nextDouble();
		area = 3.14*r*r;
		circum = 2*3.14*r;
		System.out.println("The area of circle is: "+area);
		System.out.println("The circumference of circle is: "+circum);
	}
}
