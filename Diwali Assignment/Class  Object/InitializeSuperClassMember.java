class SuperClass
{
	int id;
	String name;
	SuperClass(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void prints()
	{
		System.out.println("ID     = "+id);	
		System.out.println("Name   = "+name);
	}
}

class BaseClass extends SuperClass
{
	int salary;
	BaseClass(int id,String name,int salary)
	{
		super(id,name);
		this.salary=salary;
	}
	void print()
	{
		prints();
		System.out.println("Salary = "+salary);
	}
}

class InitializeSuperClassMember
{
	public static void main(String[] args)
	{
		BaseClass b=new BaseClass(101,"Sandip",50000);
		b.print();
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java InitializeSuperClassMember
ID     = 101
Name   = Sandip
Salary = 50000
 */