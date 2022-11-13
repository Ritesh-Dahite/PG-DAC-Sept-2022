import java.util.*;
class ArrayListColorAddFirst
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
		
		colour.add(0,"White");
		
		System.out.println("After Adding White to 1st position :");
		display(colour);
	}
}

	
	
/* 	
How many element you want to add :3
enter element :
green
red
blue

Colour ArrayList Elements :
green
red
blue
After Adding White to 1st position :
Colour ArrayList Elements :
White
green
red
blue
 */