import java.util.*;
public class FibonacciUsingRecursion
{
	public static int fib(int num)
	{
		if(num==0)
		{
			return 0;
		}
		if(num==1 || num==2)
		{
			return 1;
		}
		return fib(num-2)+fib(num-1);
	}
	
    public static void main(String args[]) 
	{
		int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        num=sc.nextInt();
		System.out.print("Fibonacci Series of "+num+" numbers: ");
		for(int i=0;i<num;i++)
		{
			System.out.print(fib(i) +" ");
		}
	}
}


/* 
D:\CDAC\ADS\Lab>java FibonacciUsingRecursion
Enter number:10
Fibonacci Series of 10 numbers: 0 1 1 2 3 5 8 13 21 34
 */