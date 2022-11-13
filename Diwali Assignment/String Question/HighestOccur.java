import java.util.*;
public class HighestOccur 
{
	static final int ASCII_SIZE = 256;
	static char getMaxOccurringChar(String str)
	{
		int count[] = new int[ASCII_SIZE];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; 
		char result = ' ';
		for (int i=0;i<len;i++) 
		{
			if (max<count[str.charAt(i)]) 
			{
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String str =sc.nextLine();
		System.out.println("Max occurring character is "+ getMaxOccurringChar(str));
	}
}




/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java HighestOccur
Enter String :-hellllooooo
Max occurring character is o

*/