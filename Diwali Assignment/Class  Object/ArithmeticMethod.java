import java.util.*;
public class ArithmeticMethod
{
	int a,b;
	ArithmeticMethod(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void Addition()
    {
        int c=a+b;
        System.out.println("Addition = "+c);
    }
    void Subtraction()
    {
        int c=a-b;
        System.out.println("Subtraction = "+c);
    }
    void Multiplication()
    {
        int c=a*b;
        System.out.println("Multiplication = "+c);
    }
    void Division()
    {
        int c=a/b;
        System.out.println("Division = "+c);
    }
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number = ");
		int a=sc.nextInt();
		System.out.println("Enter Second number = ");
		int b=sc.nextInt();
		ArithmeticMethod am=new ArithmeticMethod(a,b);
        am.Addition();
        am.Subtraction();
        am.Multiplication();
        am.Division();
    }
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java ArithmeticMethod
Enter First number =
20
Enter Second number =
5
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
 */
