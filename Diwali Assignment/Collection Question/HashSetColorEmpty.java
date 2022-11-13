import java.util.*;
class HashSetColorEmpty
{
	static void display(HashSet<String> colour)
	{
		System.out.println("HastSet Elements :");
		Iterator<String> it = colour.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		HashSet<String> colour=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("How many element you want to add :");
		int n=sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("enter element :");
		for(int i=0;i<n;i++)
		{
			str=sc.nextLine();
			colour.add(str);
		}	
		
		System.out.println();
		display(colour);
		
		colour.clear();
		System.out.println("After Empty Operation :"); 
		display(colour);
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java HashSetColorEmpty
How many element you want to add :3
enter element :
red
green
yellow

HastSet Elements :
red
green
yellow
After Empty Operation :
HastSet Elements :
 */