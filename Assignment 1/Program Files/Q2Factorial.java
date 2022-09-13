import java.util.Scanner;

class Q2Factorial{
	public static void main(String args[]){
		System.out.print("Enter a number you want a Factorial of: ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int a = 1;
		int fact = 1;
		
		while(a<=n){
			fact = fact * a;
			a++;
		}
		
		System.out.print("The Factorial of "+n+" is "+fact);
		
	}
}