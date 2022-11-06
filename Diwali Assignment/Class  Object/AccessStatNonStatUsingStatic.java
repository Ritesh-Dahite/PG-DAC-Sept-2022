class AccessStatNonStatUsingStatic
{
	static int a=10;
	int b=20;
	
	static void Staticget()
	{
		a++;
		System.out.println("a = "+a);	
	}
	
	void NonStatget()
	{
		b++;
		System.out.println("b = "+b);
		
	}
	public static void main(String[] args)
	{
		Staticget();
		AccessStatNonStatUsingStatic a=new AccessStatNonStatUsingStatic();
		a.NonStatget();
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java AccessStatNonStatUsingStatic
a = 11
b = 21
*/