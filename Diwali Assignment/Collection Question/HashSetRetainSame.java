import java.util.*;
class HashSetRetainSame
{
	static void display(HashSet<String> colour)
	{
		Iterator<String> it = colour.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		HashSet<String> colour=new HashSet<>();
		HashSet<String> colour1=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("How many element you want to add in First Set :");
		int n=sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("enter First Set element :");
		for(int i=0;i<n;i++)
		{
			str=sc.nextLine();
			colour.add(str);
		}	
		System.out.print("How many element you want to add in Second Set :");
		n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter First Set element :");
		for(int i=0;i<n;i++)
		{
			str=sc.nextLine();
			colour1.add(str);
		}
		
		System.out.println();
		
		System.out.println("First HastSet Elements :");
		display(colour);
		System.out.println("Second HastSet Elements :");
		display(colour1);
		
		colour.retainAll(colour1);
		System.out.println("After Retain Operation :"); 
		display(colour);
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java HashSetRetainSame
How many element you want to add in First Set :3
enter First Set element :
red
blue
green
How many element you want to add in Second Set :4
enter First Set element :
red
yellow
blue
gray

First HastSet Elements :
red
green
blue
Second HastSet Elements :
red
gray
blue
yellow
After Retain Operation :
red
blue */
