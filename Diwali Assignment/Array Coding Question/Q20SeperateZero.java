import java.util.*;

class Q20SeperateZero
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.print("Enter Array Elements :");
		int[] op=new int[size];
		int k=0;
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]!=0)
			{
				op[k]=arr[i];
				k++;
			}
		}
		
		System.out.print("Array Elements are :");
		
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		
		System.out.println();
		System.out.print("After seperation array element are :");
		
		for(int i=0;i<size;i++)
		{
			System.out.print(op[i]+"   ");
		}
	}
}