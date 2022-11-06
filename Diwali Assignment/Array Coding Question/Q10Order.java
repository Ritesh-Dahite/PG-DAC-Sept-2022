import java.util.*;

class Q10Order
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of elements you want to check : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int x = -1;
		
		System.out.println("Enter the elements :");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < n-1; i++)
		{
			if(arr[i]<arr[i+1])
			{
				if(arr[i]>arr[i+1])
					break;
				x = 1;
			}
			break;
		}
		
		for(int i = 0; i < n-1; i++)
		{
			if(arr[i]>arr[i+1])
			{
				if(arr[i]<arr[i+1])
					break;
				x = 0;
			}
			break;
		}
		
		if(x == 1)
			System.out.println("Ascending");
		else if(x == 0)
			System.out.println("Descending");
		else if(x == -1)
			System.out.println("Random");
	}
}