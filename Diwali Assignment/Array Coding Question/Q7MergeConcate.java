import java.util.*;

class Q7MergeConcate
{
	public static void main(String args[])
	{
		int a, b, c, x = 0, y = 0, z = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of elements in 1st array : ");
		a = sc.nextInt();
		System.out.print("Total number of elements in 2nd array : ");
		b = sc.nextInt();
		c = a + b;
		
		int arr1[] = new int[a];
		int arr2[] = new int[b];
		int arr3[] = new int[c];
		
		
		System.out.println("Enter elements in first array : ");
		for(int i = 0; i < a; i++)
			arr1[i] = sc.nextInt();
		
		System.out.println("Enter elements in second array : ");
		for(int i = 0; i < b; i++)
			arr2[i] = sc.nextInt();
		
		while(x<a && y<b)
		{
			arr3[z++] = arr1[x++];
			arr3[z++] = arr2[y++];
		}
		
		while(x<a)
			arr3[z++] = arr1[x++];
		
		while(y<b)
			arr3[z++] = arr2[y++];
		
		System.out.println("Array after merging and concatenating");
		System.out.print("[ ");
		for(int i = 0; i < c; i++)
			System.out.print(arr3[i]+" ");
		System.out.print("]");
	}
}