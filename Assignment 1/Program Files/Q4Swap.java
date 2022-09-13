import java.util.Scanner;

class Q4Swap{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int a = num.nextInt();	//10
		System.out.print("Enter the 2nd number: ");
		int b = num.nextInt();	//15
		
		a = a + b;	//25
		b = a - b;	//10
		a = a - b;	//15
		
		System.out.println();
		System.out.println("After Swaping: ");
		System.out.println("1st Number is "+a);
		System.out.println("2nd Number is "+b);
				
	}
}