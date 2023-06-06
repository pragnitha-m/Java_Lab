import java.io.*;
import java.util.*;
class binary_add
{
	public static void main(String args[])
	{
		long b1, b2;
  		int i=0, r=0;
  		int sum[] = new int[20];
  		Scanner in = new Scanner(System.in);
  		System.out.println("Input first binary number: ");
  		b1 = in.nextLong();
  		System.out.println("Input second binary number: ");
  		b2 = in.nextLong();
		while (b1 != 0 || b2 != 0) 
  		{
   			sum[i++] = (int)((b1%10+b2%10+r)%2);
   			r = (int)((b1%10+b2%10+r)/2);
   			b1 = b1/10;
   			b2 = b2/10;
  		}
  		if (r!=0) 
  		{
   			sum[i++]=r;
  		}
  		--i;
  		System.out.print("Sum of two binary numbers: ");
  		while (i >= 0) 
  		{
   			System.out.print(sum[i--]);
  		}
   		System.out.print("\n");  
 	}
}
