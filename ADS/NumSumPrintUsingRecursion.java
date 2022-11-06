import java.util.*;

public class NumSumPrintUsingRecursion
{
    static int addNumbers(int num) 
	{
        if (num!=0)
            return num+addNumbers(num-1);
        else
            return num;
    }
	
	public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        System.out.print("Sum of 0 to "+n+" :"+addNumbers(n));
    }
}

/* 
D:\CDAC\ADS\Lab>java NumSumPrintUsingRecursion
Enter a number:10
Sum of 0 to 10 :55
 */