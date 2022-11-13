import java.util.*;
 
public class Q22ArrToTreeSet
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Integer[] arr=new Integer[size];
		System.out.print("Enter Array Elements :");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for(int a : arr)
		{
			ts.add(a);
		}
		
		System.out.println("TreeSet contains: " + ts);
	}
}