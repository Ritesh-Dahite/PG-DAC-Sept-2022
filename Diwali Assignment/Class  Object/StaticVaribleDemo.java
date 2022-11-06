class Count
{
	static int count=0;
	Count()
	{
		count++;
		System.out.println("Object Created.");
	}
	
	static void count()
	{
		System.out.println("Total "+count+" Object Created.");
	}
}

public class StaticVaribleDemo
{
	public static void main(String[] args)
	{
		System.out.println("Here We use a static variable to count the total object created.");
		Count o1=new Count();
		Count o2=new Count();
		Count o3=new Count();
		Count.count();
		Count o4=new Count();
		Count o5=new Count();
		Count.count();
	}	
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java StaticVaribleDemo
Here We use a static variable to count the total object created.
Object Created.
Object Created.
Object Created.
Total 3 Object Created.
Object Created.
Object Created.
Total 5 Object Created.
 */