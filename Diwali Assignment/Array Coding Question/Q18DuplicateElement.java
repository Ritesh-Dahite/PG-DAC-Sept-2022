import java.util.*;

class Q18DuplicateElement
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] temp=new int[size];
		int k=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					temp[k]=arr[i];
					k++;
				}
			}
		}
		System.out.print("Duplicate elements = ");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+"   ");
		}
	}
}