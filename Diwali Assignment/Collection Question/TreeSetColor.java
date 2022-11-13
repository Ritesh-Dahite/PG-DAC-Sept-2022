import java.util.*;
class TreeSetColor
{
	public static void main(String[] args)
	{
		TreeSet<String> colour=new TreeSet<>();
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
		
		System.out.print("TreeSet Element =");
		System.out.println(colour);
		
	}
}



/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\Collection>java TreeSetColor
How many element you want to add :3
enter element :
red
green
blue
TreeSet Element =[blue, green, red]
 */