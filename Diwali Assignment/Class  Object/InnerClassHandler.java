class Outer
{
	Inner i;
	Outer()
	{
		System.out.println("This is Outer Constructor");
		i=new Inner();
	}
	class Inner
	{
		Inner()
		{
			System.out.println("This is Inner Constructor");
		}
		void InnerMethod()
		{
			System.out.println("This is Inner class method");
		}
		static void StaticInnerMethod()
		{
			System.out.println("This is static Inner class method");
		}
	}
	
	static class StatIn
	{
		StatIn()
		{
			System.out.println("This is Static Inner Constructor");
		}
		void StatInMethod()
		{
			System.out.println("This is Static Inner class method");
		}
		static void StaticInnerMethodofStatIn()
		{
			System.out.println("This is static method of Static Inner class method");
		}
	}
}

class InnerClassHandler
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.i.InnerMethod();
		Outer.Inner.StaticInnerMethod();
		
		Outer.StatIn os=new Outer.StatIn();
		os.StatInMethod();
		os.StaticInnerMethodofStatIn();

	}
	
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java InnerClassHandler
This is Outer Constructor
This is Inner Constructor
This is Inner class method
This is static Inner class method
This is Static Inner Constructor
This is Static Inner class method
This is static method of Static Inner class method
 */