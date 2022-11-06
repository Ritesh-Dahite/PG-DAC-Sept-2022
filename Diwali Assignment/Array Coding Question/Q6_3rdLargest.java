import java.util.*;

class Q6_3rdLargest
{
	public static void main(String args[])
	{
		int n, max1 = 0, max2 = 0, max3 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of elements : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements =>");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			if(max1<arr[i])
				max1 = arr[i];
		}
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == max1)
				continue;
			if(max2<arr[i])
				max2 = arr[i];
		}
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == max1 || arr[i] == max2)
				continue;
			if(max3<arr[i])
				max3 = arr[i];
		}
		System.out.println("3rd - Largest number among the given input is : "+max3);
	}
}