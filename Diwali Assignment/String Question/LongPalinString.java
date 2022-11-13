import java.util.*;
public class LongPalinString 
{
	static int longestPalSubstr(String str)
	{
		int n = str.length();
		if (n < 2)
			return n; 

		int maxLength = 1,start=0;
		int low, high;
		for (int i = 0; i < n; i++) 
		{
			low = i - 1;
			high = i + 1;
			while ( high < n && str.charAt(high) == str.charAt(i)) 								
				high++;
		
			while ( low >= 0 && str.charAt(low) == str.charAt(i)) 					
				low--;
		
			while (low >= 0 && high < n && str.charAt(low) == str.charAt(high))
			{
				low--;
				high++;
			}
			int length = high - low - 1;
			if (maxLength < length)
			{
				maxLength = length;
				start=low+1;
			}
		}	
		System.out.print("Longest palindrome substring is: ");
		System.out.println(str.substring(start, start + maxLength ));
		return maxLength;	
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String str =sc.nextLine();
		System.out.println("Length is: "+longestPalSubstr(str));
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java LongPalinString
Enter String :-heelloolls
Longest palindrome substring is: llooll
Length is: 6

 */