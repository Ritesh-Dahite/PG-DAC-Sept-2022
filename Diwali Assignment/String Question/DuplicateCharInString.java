import java.util.*;

class DuplicateCharInString 
{  
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String :");
		String str1=sc.nextLine();  
		int count;  
		  
		char ch[] = str1.toCharArray();  
		  
		System.out.println("Duplicate characters in a given string: ");  
		for(int i=0;i<ch.length;i++) 
		{  
			count=1;  
			for(int j=i+1;j<ch.length;j++) 
			{  
				if(ch[i] == ch[j] && ch[i]!=' ') 
				{  
					count++;   
					ch[j]='0';  
				}  
			}  
			
			if(count > 1 && ch[i]!='0')
				System.out.print(ch[i]+"  ");
		}  
	}  
} 


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java DuplicateCharInString
Enter Any String :
hello hii
Duplicate characters in a given string:
h  l  i
 */