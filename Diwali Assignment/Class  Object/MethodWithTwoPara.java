class MethodWithTwoPara
{
	int a,b,sum;
	
	void add(int a,int b)
	{
		sum=a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	
	
	public static void main(String[] args)
	{
		MethodWithTwoPara m=new MethodWithTwoPara();
		m.add(10,20);
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java MethodWithTwoPara
10 + 20 = 30
 */