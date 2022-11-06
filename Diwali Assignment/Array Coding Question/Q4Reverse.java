import java.util.*;

class Q4Reverse
{
	public static void main(String args[])
	{
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of elements you want in an array : ");
		n = sc.nextInt();
		int n_arr[] = new int[n];
		int r_arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Element number "+(i+1)+" is -> ");
			n_arr[i] = sc.nextInt();
		}
		
		for(int i = n-1; i >= 0; i--)
		{
			r_arr[i] = n_arr[n-1-i];
		}
		
		System.out.println("Reversed elements of an array is as follows");

		System.out.print("[ ");

		for(int i = 0; i < n; i++)
		{
			System.out.print(r_arr[i]+" ");
			
		}
		
		System.out.print("]");
	}
}