import java.util.*;
class RemoveDuplicateChar
{
	static String removeDuplicate(char str[], int n)
	{
		int index=0;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(str[i] == str[j])
				{
					break;
				}
			}
			if(j==i)
			{
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String st =sc.nextLine();
		char str[] = st.toCharArray();
		int n=st.length();
		System.out.println("After Removing Duplicates := "+removeDuplicate(str, n));
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java RemoveDuplicateChar
Enter String :-hhheeelllooo
After Removing Duplicates := helo
 */