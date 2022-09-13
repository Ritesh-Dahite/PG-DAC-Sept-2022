import java.util.Scanner;

class Q5PositiveNegative{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = num.nextInt();
		
		if(a>=0){
			System.out.println("Entered number "+a+" is Positive");
		}
		else{
			System.out.println("Entered number "+a+" is Negative");
		}
	}
}