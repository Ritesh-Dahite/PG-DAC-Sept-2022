import java.util.Scanner;

class Q1EvenOdd{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		
		if(n%2 == 0){
			System.out.print("The entered number "+n+" is Even");
		}
		else{
			System.out.print("The entered number "+n+" is Odd");
		}
	}
}