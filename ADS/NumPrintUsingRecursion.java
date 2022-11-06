import java.util.*;

public class NumPrintUsingRecursion
{
    static void numPrint(int last, int first)
    {
        if(first<=last)
        {
            System.out.print(first+"  ");
            numPrint(last,++first);
        }
    }
	
	public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        System.out.print("Numbers till "+n+" :");
        numPrint(n,1);
    }
}

/* 
D:\CDAC\ADS\Lab>java NumPrintUsingRecursion
Enter a number:10
Numbers till 10 :1  2  3  4  5  6  7  8  9  10
 */