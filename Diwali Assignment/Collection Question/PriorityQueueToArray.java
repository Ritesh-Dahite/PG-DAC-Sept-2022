import java.util.*;
class PriorityQueueToArray
{
	public static void main(String[] args)
	{
		PriorityQueue<String> colour=new PriorityQueue<>();
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
		System.out.print("PriorityQueue Element =");
		System.out.println(colour);
		
		String[] pq=new String[colour.size()];
		colour.toArray(pq);
		System.out.println("After PriorityQueue to Array Operation :"); 
		for(String s : pq)
			System.out.print(s+"  ");
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java PriorityQueueToArray
How many element you want to add :3
enter element :
red
green
blue

PriorityQueue Element =[blue, red, green]
After PriorityQueue to Array Operation :
blue  red  green
 */