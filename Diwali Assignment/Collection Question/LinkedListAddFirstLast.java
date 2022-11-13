import java.util.*;
class LinkedListAddFirstLast
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
		
		System.out.println("Enter First Element :");
		String first=sc.nextLine();
		colour.addFirst(first);
		
		System.out.println("Enter Last Element :");
		String last=sc.nextLine();
		colour.addLast(last);
		
		System.out.println("After Adding White to last position :");
		display(colour);
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java LinkedListAddFirstLast
How many element you want to add :3
enter element :
red
grren
blue

Colour ArrayList Elements :
red
grren
blue
Enter First Element :
white
Enter Last Element :
black
After Adding White to last position :
Colour ArrayList Elements :
white
red
grren
blue
black
 */