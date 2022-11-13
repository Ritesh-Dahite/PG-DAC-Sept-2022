import java.util.*;
class GetKeyValueElement
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
		
		System.out.print("HashMap Element =");
		System.out.println(colour);
		
		System.out.print("Enter Key value to retrieve :");
		key=sc.nextInt();
		System.out.print("Value at "+key+" position = "+colour.get(key));
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java GetKeyValueElement
How many element you want to add :3
enter element :
1 red
2 blue
3 green

HashMap Element ={1= red, 2= blue, 3= green}
Enter Key value to retrieve :2
Value at 2 position =  blue
 */