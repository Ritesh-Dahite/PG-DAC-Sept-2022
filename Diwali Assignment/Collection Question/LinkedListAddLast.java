import java.util.*;
class LinkedListAddLast
{
	static void display(LinkedList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(String s : colour)
			System.out.println(s);
	}
	public static void main(String[] args)
	{
		LinkedList<String> colour=new LinkedList<>();
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
		
		colour.addLast("White");
		
		System.out.println("After Adding White to last position :");
		display(colour);
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java LinkedListAddLast
How many element you want to add :3
enter element :
red
green
blue

Colour ArrayList Elements :
red
green
blue
After Adding White to last position :
Colour ArrayList Elements :
red
green
blue
White
 */