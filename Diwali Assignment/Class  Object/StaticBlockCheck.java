class CheckBlock
{
	static
	{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is non static block");
	}
	static
	{
		System.out.println("This is secod static block");
	}
	
	{
		System.out.println("This is second non static block");
	}

}

class StaticBlockCheck
{
	public static void main(String[] args)
	{
		CheckBlock c=new CheckBlock();
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\class  object>java StaticBlockCheck
This is static block
This is secod static block
This is non static block
This is second non static block
 */