import java.util.*;

class Q11ByteArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		byte a[] = str.getBytes();
		System.out.println("Given byte array is : "+a);
		
		String s = new String(a);
		System.out.println("Given byte array to string is : "+s);
	}
}