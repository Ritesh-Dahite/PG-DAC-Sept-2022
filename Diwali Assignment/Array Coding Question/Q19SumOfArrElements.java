import java.util.*;

class Q19SumOfArrElements
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		int sum=0;
		
		System.out.print("Enter Array Elements :");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print("Sum of array element = "+sum);
	}
}