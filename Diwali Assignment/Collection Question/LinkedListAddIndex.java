import java.util.*;
class LinkedListAddIndex
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
		
		System.out.println("Enter new Element :");
		String key=sc.nextLine();
		System.out.println("Enter new Element position :");
		int pos=sc.nextInt();
		colour.add(pos-1,key);
		display(colour);
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java LinkedListAddIndex.java
How many element you want to add :3
enter element :
red
green
blue

Colour ArrayList Elements :
red
green
blue
Enter new Element :
black
Enter new Element position :
3
Colour ArrayList Elements :
red
green
black
blue
 */