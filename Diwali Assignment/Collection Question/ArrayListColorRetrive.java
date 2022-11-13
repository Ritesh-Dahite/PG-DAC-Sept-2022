import java.util.*;
class ArrayListColorRetrive
{
	static void display(ArrayList<String> colour)
	{
		System.out.println("Colour ArrayList Elements :");
		for(String s : colour)
			System.out.println(s);
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
		
		System.out.print("Which position element you want to print :");
		int index=sc.nextInt();
		System.out.println(colour.get(index-1));
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java ArrayListColorRetrive.java
How many element you want to add :4
enter element :
red
green
yellow
blue

Colour ArrayList Elements :
red
green
yellow
blue
Which position element you want to print :3
yellow
 */