class Test
{
	int a=10;
	static int b=10;
	Test()
	{
		b++;
	}
}

class InstanceVariableDemo
{
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println(" Instance variable = "+t.a);
		System.out.println(" Static variable = "+t.b);
		
		Test t1=new Test();
		System.out.println(" Instance variable = "+t1.a);
		System.out.println(" Static variable = "+t1.b);
		
		Test t2=new Test();
		System.out.println(" Instance variable = "+t2.a);
		System.out.println(" Static variable = "+t2.b);
	}
	
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java InstanceVariableDemo
 Instance variable = 10
 Static variable = 11
 Instance variable = 10
 Static variable = 12
 Instance variable = 10
 Static variable = 13
  */