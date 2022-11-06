import java.util.*;
public class FactorialUsingRecursion
{
    static int fact(int num)
    {
        if(num>1)
        {
            return(num*fact(num-1));
        }
        return 1;
    }
	
	public static void main(String[] args) 
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        num=sc.nextInt();
        System.out.println("Factorial of "+num+" : "+fact(num));
    }
}

/* 
D:\CDAC\ADS\Lab>java FactorialUsingRecursion
Enter Number:5
Factorial of 5 : 120
 */