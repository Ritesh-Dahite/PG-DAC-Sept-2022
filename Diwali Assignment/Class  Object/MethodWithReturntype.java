import java.util.*;

class MethodWithReturntype
{
	int a,b;
	MethodWithReturntype(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int add()
	{
		return a+b;
	}
	
	
	public static void main(String[] args)
	{
		MethodWithReturntype m=new MethodWithReturntype(10,20);
		int sum=m.add();
		System.out.println(m.a+" + "+m.b+" = "+sum);
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java MethodWithReturntype
10 + 20 = 30
 */