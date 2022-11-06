class P5
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 4-i; j > 0; j--)
			{
				System.out.print(" ");
			}
			
			int a = i;
			for(int k = 1; k <= i; k++)
			{
				System.out.print(a--);
			}
			
			for(int l = 2; l <= i; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		
		for(int i = 3; i >= 1; i--)
		{
			for(int j = 4-i; j >= 1; j--)
			{
				System.out.print(" ");
			}
			
			for(int k = i; k >= 1; k--)
			{
				System.out.print(k);
			}
			
			for(int l = 2; l <= i; l++)
			{
				System.out.print(l);
			}
			
			System.out.println();
		}
	}
}