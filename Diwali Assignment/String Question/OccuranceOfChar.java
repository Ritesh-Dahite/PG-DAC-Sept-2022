import java.util.*;
class OccuranceOfChar
{
    public static int count(String s, char c)
    {
        int res = 0;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == c)
            res++;
        }
        return res;
    }
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String str =sc.nextLine();
		System.out.print("Enter Character :-");
		char c=sc.nextLine().charAt(0);
        System.out.println(c+" occurs -> "+count(str, c)+" times.");
    }
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java OccuranceOfChar
Enter String :-settlleeemennntt
Enter Character :-t
t occurs -> 4 times.
 */