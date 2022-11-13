import java.util.*;

public class Q21ArrayToList
{
	public static void main(String args[])
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Integer[] arr1=new Integer[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		List<Integer> list1 = Arrays.asList(arr1);
		System.out.print(list1);
		System.out.println("Conversion using asList() method ");
		
		List<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2,arr1);
		System.out.print(list2);
		System.out.println("Conversion using addAll() method ");
		
		List<Integer> list3 = new ArrayList<Integer>();
		for(int a : arr1)
		{
			list3.add(a);
		}
		System.out.print(list3);
		System.out.println("Conversion using add() method ");
	}
}