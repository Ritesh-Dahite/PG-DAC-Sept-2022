import java.util.*;

class Q14EqualArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Arrays Size :");
		int size1=sc.nextInt();
		
		int[] arr1=new int[size1];
		
		System.out.print("Enter First Array Elements :");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter Second Arrays Size :");
		int size2=sc.nextInt();
		int count=0;
		
		if(size2==size1)
		{
			int[] arr2=new int[size2];
			System.out.print("Enter Second Array Elements :");
			
			for(int i=0;i<size2;i++)
			{
				arr2[i]=sc.nextInt();
			}
			
			for(int i=0;i<size1;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("Array Not Equal");
					break;
				}
				else
				{
					count++;
				}
			}
			
			if(count==size1)
			{
				System.out.println("Array Equal");	
			}
			
		}
		
		else
		{
			System.out.println("Array Not Equal");
		}
	}
}