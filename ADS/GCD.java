class GCD
{
	public static void main(String[] args)
	{
		int num=5;
		//System.out.println("GCD of "+num+" is "+gcd("int",num));
		String result=gcd("int",5);
		System.out.println(result);
	}
	
	
	static String gcd(String str,int n)
	{
		if(n!=1)
			return "int";
		return gcd(int,gcd(n-1));
	}
}


/* 
input: n=3
	output: gcd(int,gcd(int,int))
	input: n=5
	output: gcd(int,gcd(int,gcd(int,gcd(int,int))))

 */