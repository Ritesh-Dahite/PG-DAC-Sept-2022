class Employee
{
	String name;
	int id;
	int salary;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void print()
	{
		System.out.println("ID     = "+id);	
		System.out.println("Name   = "+name);
		System.out.println("Salary = "+salary);
	}
}

class ValueUsingConstructor
{
	public static void main(String[] args)
	{
		Employee e=new Employee(101,"Sandip",45000);
		e.print();
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java ValueUsingConstructor
ID     = 101
Name   = Sandip
Salary = 45000
 */
