import java.util.*;

class Q5SmallLarge
{
	public static void main(String args[])
	{
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of elements : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements =>");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0], max = arr[0];
		
		for(int i = 1; i < n; i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
			
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest number among the given input is : "+min);
		System.out.println("Largest number among the given input is : "+max);	
	}
}