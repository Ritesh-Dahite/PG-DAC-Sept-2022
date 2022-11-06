class P19
{
	public static void main(String args[])
	{
		for(int i = 1; i <=7; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j+" ");
			}
			
			int a = i;
			for(int j = 2; j <= i; j++)
			{
				a--;
				System.out.print(a +" ");
			}
			System.out.println();
		}
	}
}