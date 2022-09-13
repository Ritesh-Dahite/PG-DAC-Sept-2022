import java.util.Scanner;

class Q12Addition{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = num.nextInt();
		System.out.print("Enter the first number: ");
		int b = num.nextInt();
		
		if(b>=0){
			for(int i=1; i<=b; i++){
				a = a + 1;
			}
			System.out.print("The sum of given number is "+a);
		}
		else{
			for(int i=0; i>b; i--){
				a = a - 1;
			}
			System.out.print("The sum of given number is "+a);
		}
		
	}
}