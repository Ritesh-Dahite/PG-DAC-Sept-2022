import java.util.*;
class KeyValueIsEmpty
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> colour=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n=sc.nextInt();
		sc.nextLine();
		String str;
		Integer key;
		System.out.println("enter element :");
		for(int i=0;i<n;i++)
		{
			key=sc.nextInt();
			str=sc.nextLine();
			colour.put(key,str);
		}	
		System.out.println();
		
		if(colour.isEmpty())
			System.out.println("Key Value is Empty");
		System.out.print("Key Value is ");
		System.out.println(colour);
		
		colour.clear();
		System.out.println("After Clear operation.");
		if(colour.isEmpty())
		{
			System.out.println("Key Value is Empty");
		}
		else
		{
			System.out.print("Key Value is ");
			System.out.println(colour);
		}
	}
}
	
/* 

D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java KeyValueIsEmpty
How many element you want to add :2
enter element :
1 red
2 blue

Key Value is {1= red, 2= blue}
After Clear operation.
Key Value is Empty
 */