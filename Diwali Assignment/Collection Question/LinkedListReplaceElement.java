import java.util.*;
class LinkedListReplaceElement
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
		System.out.println("Enter Position to replace value :");
		int pos=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new Value :");
		String val=sc.nextLine();
		colour.set(pos-1,val);
		System.out.println("After Replacing ");
		display(colour);
	}
}
		
		
/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java LinkedListReplaceElement
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

Enter Position to replace value :
3
Enter new Value :
black
After Replacing
Colour ArrayList Elements :
Element 1 = red
Element 2 = green
Element 3 = black
Element 4 = yellow
 */