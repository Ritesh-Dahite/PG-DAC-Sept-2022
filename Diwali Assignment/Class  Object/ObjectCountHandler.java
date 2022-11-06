class ObjectCount
{
	static int count=0;
	ObjectCount()
	{
		count++;
		System.out.println("Object Created.");
	}
	
	static void count()
	{
		System.out.println("Total "+count+" Object Created.");
	}
}

public class ObjectCountHandler
{
	public static void main(String[] args)
	{
		ObjectCount o1=new ObjectCount();
		ObjectCount o2=new ObjectCount();
		ObjectCount o3=new ObjectCount();
		ObjectCount.count();
		ObjectCount o4=new ObjectCount();
		ObjectCount o5=new ObjectCount();
		ObjectCount.count();
	}	
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java ObjectCountHandler
Object Created.
Object Created.
Object Created.
Total 3 Object Created.
Object Created.
Object Created.
Total 5 Object Created.
 */