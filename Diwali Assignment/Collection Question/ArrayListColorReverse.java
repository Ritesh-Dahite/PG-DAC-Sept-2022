import java.util.*;
class ArrayListColorReverse
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
		System.out.println("Before Reversing :");
		display(colour);
		System.out.println("After sorting :");
		Collections.reverse(colour);  
		display(colour);
		
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java ArrayListColorReverse
How many element you want to add :3
enter element :
red
green
blue

Before Reversing :
Colour ArrayList Elements :
red
green
blue
After sorting :
Colour ArrayList Elements :
blue
green
red
 */