import java.util.*;
class Permutation
{
	static void display(String str, String res)
	{
		if(str.length() == 0)
		{
			System.out.println(res);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char r1 = str.charAt(i);
			String r2 = str.substring(0,i) + str.substring(i+1);
			display(r2,res+r1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String s=sc.nextLine();;
		display(s,"");
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java Permutation
Enter String :ADS
ADS
ASD
DAS
DSA
SAD
SDA
 */