import java.util.*;

class CheckOnlyDigit 
{
    public static boolean onlyDigits(String str,int n)
    {
        for(int i=0;i<n;i++) 
		{
            if(str.charAt(i)<'0' || str.charAt(i)>'9') 
			{
                return false;
            }
        }
        return true;
    }
	
	
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String str =sc.nextLine();
        int len = str.length();
        System.out.println("String contains only digit :- "+onlyDigits(str,len));
    }
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java CheckOnlyDigit
Enter String :-abc123
String contains only digit :- false

D:\CDAC\OOPs\Assignment\Diwali Gift\String>java CheckOnlyDigit
Enter String :-1234
String contains only digit :- true

D:\CDAC\OOPs\Assignment\Diwali Gift\String>java CheckOnlyDigit
Enter String :-1431fdfs3
String contains only digit :- false
 */