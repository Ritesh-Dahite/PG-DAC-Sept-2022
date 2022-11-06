import java.util.*;

class Q2EqualityOfArr
{
	public static void main(String args[])
	{
		int n;
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many total number of elements do you want to check in an array?");
		n = sc.nextInt();
		
		int newarr1[] = new int[n];
		
		System.out.println("Add elements to the 1st array ==>");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Element number "+(i+1)+" is -> ");
			newarr1[i] = sc.nextInt();
		}
		
		int newarr2[] = new int[n];
		
		System.out.println("Add elements to the 2nd array ==>");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Element number "+(i+1)+" is -> ");
			newarr2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(newarr1[i] == newarr2[i])
				flag = true;
			else
			{
				flag = false;
				break;
			}
		}
		
		if(flag == true)
			System.out.println("Array1 is equal to Array2");
		else
			System.out.println("Array1 is not equal to Array2");
	}
}