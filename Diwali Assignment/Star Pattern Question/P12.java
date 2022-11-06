class P12
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 6-i; j >= 1; j--)
			{
				System.out.print(" ");
			}
			
			char a = 'A';
			for(int j = 1; j <= i; j++)
			{
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}