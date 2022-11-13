import java.util.*;
class ArrayListColorSort
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
		System.out.println("Before sorting :");
		display(colour);
		System.out.println("After sorting :");
		Collections.sort(colour);  
		display(colour);
		
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java ArrayListColorSort.java
How many element you want to add :4
enter element :
red
green
blue
white

Before sorting :
Colour ArrayList Elements :
red
green
blue
white
After sorting :
Colour ArrayList Elements :
blue
green
red
white
 */