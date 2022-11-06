import java.util.*;
class First
{
	int a;
	First(int a)
	{
		this.a=a;
	}
}

class Second
{
	int b;
	Second(int b)
	{
		this.b=b;
	}
}

class Addition
{
	int sum;
	Addition(First f,Second s)
	{
		sum=f.a+s.b;
	}
	void show()
	{
		System.out.println("Sum = "+sum);
	}
	
	
}
class ObjectPassingReturning
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number = ");
		int aa=sc.nextInt();
		First f=new First(aa);
		System.out.println("Enter Second Number = ");
		int bb=sc.nextInt();
		Second s=new Second(bb);
		Addition a=new Addition(f,s);
		a.show();
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java ObjectPassingReturning
Enter First Number =
10
Enter Second Number =
20
Sum = 30
 */