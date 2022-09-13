import java.util.Scanner;

class Q13Reverse{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int temp = n;
		int rev = 0;
		
		if(n>0){
			while(n>0){
				int rem = n % 10;
				rev = rev * 10 + rem;
				n = n/10;
			}
			System.out.println("The reverse of "+temp+" is "+rev);
		}
		else{
			System.out.println("Enter a Positive Number");
		}
	}
}