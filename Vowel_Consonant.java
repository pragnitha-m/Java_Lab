import java.io.*;
class vowel_consonant
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character: ");  
        	char ch = (char)obj.read();
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch+" is a vowel");
		}
		else
			System.out.println(ch+" is a consonant");
	}
}
