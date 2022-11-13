import java.util.*;
class CountKeyValueMapping
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
		System.out.println("Size of the hash map: "+colour.size());
		
		System.out.print("HashMap Element =");
		System.out.println(colour);
	}
}
		
		
/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java CountKeyValueMapping
How many element you want to add :3
enter element :
1 red
2 blue
3 green

Size of the hash map: 3
HashMap Element ={1= red, 2= blue, 3= green}
 */