class P23
{
	public static void main(String args[])
	{
		int a =1;
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= 7; j++)
			{
				if(a%2 == 0)
					System.out.print("0");
				else
					System.out.print("1");
				a++;
			}
			System.out.println();
		}
	}
}