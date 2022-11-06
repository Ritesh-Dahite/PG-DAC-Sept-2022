import java.util.*;

class Q9Series
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of elements you want : ");
		int a = sc.nextInt();
		int arr1[] = new int[a+1];
		
		for(int i = 1; i < arr1.length; i++)
		{
			if(i%2!=0)
				arr1[i] = i * i * i;
			if(i%2==0)
				arr1[i] = i * i;
		}
		
		for(int i = 1; i < arr1.length; i++)
			System.out.print(arr1[i]+" ");
	}
}