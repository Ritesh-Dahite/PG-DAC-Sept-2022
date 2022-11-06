import java.util.*;
class ReverseString   //using recursion
{
	static String display(String str)
	{
		if(str.isEmpty())
			return str;
		else
		{
			return display(str.substring(1))+str.charAt(0);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the String: ");
		String str = sc.next();
		//System.out.println(str.substring(1));
		System.out.print(display(str));
		
	}
}