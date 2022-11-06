class One
{
	One()
	{
		System.out.println("Default Constructor of One class");
	}
	
	One(int a)
	{
		this();
		System.out.println("Parameterized Constructor of One class. a="+a);
	}
}

class Two extends One
{
	Two()
	{
		this(10,20);
		System.out.println("Default Constructor of Two class");
	}
	
	Two(int a,int b)
	{
		super(a);
		System.out.println("Parameterized Constructor of Two class. b="+b);
	}
}

class ChainingConstructor
{
	public static void main(String[] args)
	{
		Two t=new Two();
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java ChainingConstructor
Default Constructor of One class
Parameterized Constructor of One class. a=10
Parameterized Constructor of Two class. b=20
Default Constructor of Two class
 */