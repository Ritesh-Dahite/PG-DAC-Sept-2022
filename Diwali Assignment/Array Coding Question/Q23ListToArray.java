import java.util.*;

public class Q23ListToArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> list= new ArrayList<String>();
		System.out.print("Enter ArrayList Size :");
		int size=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Elements :");
		
		for(int i=0;i<size;i++)
		{
			String str=sc.nextLine();
			list.add(str);
		}
		
		String arr[] = new String[list.size()];
		
		for(int j=0;j<list.size();j++)
		{
			arr[j]=list.get(j);
		}
		
		System.out.println("After converion of arraylist to string array");
		
		for(String k : arr)
		{
			System.out.println(k);
		}
	}
}