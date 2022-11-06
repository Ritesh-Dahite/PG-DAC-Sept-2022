import java.util.*;

class Q1PrintElements
{
	public static void main(String args[])
	{
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want in an array?");
		n = sc.nextInt();
		
		int newarr[] = new int[n];
		
		System.out.println("Add elements to the array ==>");
		
		for(int i = 0; i < newarr.length; i++)
		{
			System.out.print("Element number "+(i+1)+" is -> ");
			newarr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in the array are as follows ->");

		for(int i = 0; i < newarr.length; i++)
		{
			System.out.println("Element number "+(i+1)+" is -> "+newarr[i]);
		}
		
	}
}