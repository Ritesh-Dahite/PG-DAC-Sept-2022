class P1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=i;s<=5;s++)
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
			{
				if(i==3 && j==2){
					System.out.print("  ");
				}
				else if((i==4 && j==2) || (i==4 && j==3))
				{
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}
				if(i==5)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}