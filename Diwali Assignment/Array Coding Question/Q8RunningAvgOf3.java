import java.util.*;

class Q8RunningAvgOf3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of elements in an array : ");
		int a = sc.nextInt();
		
		int arr1[] = new int[a];
		int arr2[] = new int[a-2];
		
		System.out.println("Enter elements for an array : ");
		for(int i = 0; i < a; i++)
			arr1[i] = sc.nextInt();
		
		for(int i = 0; i < a-2; i++)
		{
			arr2[i] = (arr1[i] + arr1[i+1] + arr1[i+2])/3;
		}
	
		System.out.println("Elements of array after running average of 3 consecutive integer =>");
		
		System.out.print("[ ");
		for(int i = 0; i < a-2; i++)
			System.out.print(arr2[i]+" ");
		System.out.print("]");
	}
}