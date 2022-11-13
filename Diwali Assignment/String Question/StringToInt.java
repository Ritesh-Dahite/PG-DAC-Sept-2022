import java.util.*;
class StringToInt
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String str =sc.nextLine();
		int i=Integer.parseInt(str);
		System.out.print("Srting to Integer = "+i);
		
    }
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java StringToInt
Enter String :-12345
Srting to Integer = 12345
 */