import java.util.*;

class SwapNum{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();	//15
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();	//10
		
		System.out.println();
		
		System.out.println("Before Swapping the numbers are "+a+" and "+b+".");
		
		System.out.println();
		
		a=a+b;	//25
		b=a-b;	//15
		a=a-b;	//10
		
		System.out.println("After Swapping the numbers are "+a+" and "+b+".");
	}
}