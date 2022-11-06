import java.util.*;

class MethodWithoutReturntype
{
	int a,b,sum;
	MethodWithoutReturntype(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		sum=a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	
	
	public static void main(String[] args)
	{
		MethodWithoutReturntype m=new MethodWithoutReturntype(10,20);
		m.add();
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java MethodWithoutReturntype
10 + 20 = 30
 */