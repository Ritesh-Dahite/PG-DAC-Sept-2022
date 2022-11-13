import java.util.*;
class ArrayListColorPrintPosition
{
	static void display(ArrayList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(int i=0;i<colour.size();i++)
		{
			System.out.println("Element "+(i+1)+" = "+colour.get(i));
		}
	}
	public static void main(String[] args)
	{
		ArrayList<String> colour=new ArrayList<>();
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
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java ArrayListColorPrintPosition
How many element you want to add :4
enter element :
red
green
yellow
blue

Colour ArrayList Elements :
Element 1 = red
Element 2 = green
Element 3 = yellow
Element 4 = blue
 */