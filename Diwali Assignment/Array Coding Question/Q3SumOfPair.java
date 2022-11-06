import java.util.*;

class Q3SumOfPair
{
	public static void main(String args[])
	{
		int n, sum, input, flag = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of elements : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements =>");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter a number for which you want all pairs of elements to be printed : ");
		input = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				sum = 0;
				sum = arr[i] + arr[j];
				
				if(input == sum)
				{
					System.out.println("The sum of "+arr[i]+" and "+arr[j]+" results to the input given ie. "+input);
					flag++;
				}
			}
		}
		if(flag == 0)
			System.out.println("There is no pair in the input array whose sum is equal to : "+input);
	}
}