import java.util.*;

class AnagramString
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first String: ");
		String str1 = input.nextLine();
		System.out.print("Enter second String: ");
		String str2 = input.nextLine();
		
		if(str1.length()==str2.length()) 
		{
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);
			
			if(Arrays.equals(char1, char2))
			{
				System.out.println(str1 + " and " + str2 + " are anagram.");
			}
			else 
			{
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}
		else 
		{
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java AnagramString
Enter first String: keep
Enter second String: peek
keep and peek are anagram.
 */