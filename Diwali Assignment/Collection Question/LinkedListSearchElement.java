import java.util.*;
class LinkedListSearchElement
{
	static void display(LinkedList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(int i=0;i<colour.size();i++)
		{
			System.out.println("Element "+(i+1)+" = "+colour.get(i));
		}
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
		System.out.println();
		System.out.print("Enter element to search :");
		String key=sc.nextLine();
		
		if(!colour.contains(key))
		{
			System.out.println(key+" is not found.");
		}
		else
		{
			System.out.println(key+" is found.");
			
		}
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java LinkedListSearchElement
How many element you want to add :4
enter element :
red
green
blue
yellow

Colour ArrayList Elements :
Element 1 = red
Element 2 = green
Element 3 = blue
Element 4 = yellow

Enter element to search :blue
blue is found.
 */