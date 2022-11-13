import java.util.*;
class ArrayListColorSwap
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
		System.out.print("enter two swapping position :");
		int index1=sc.nextInt();
		int index2=sc.nextInt();
		
		System.out.println("Before Swapping :");
		display(colour);
		
		System.out.println("After Swapping :");
		Collections.swap(colour,index1-1,index2-1);
		display(colour);
		
	}
}


/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java ArrayListColorSwap
How many element you want to add :4
enter element :
red
green
blue
yellow

enter two swapping position :2 4

Before Swapping :
Colour ArrayList Elements :
red
green
blue
yellow

After Swapping :
Colour ArrayList Elements :
red
yellow
blue
green
 */