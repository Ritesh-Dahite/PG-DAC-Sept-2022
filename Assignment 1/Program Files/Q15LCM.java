import java.util.Scanner;

class Q15LCM{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int a = num.nextInt();
		System.out.print("Enter the 2nd number: ");
		int b = num.nextInt();
		int gcd = 1;
		int lcm = 1;
		
		if(a==b){
			System.out.println("LCM is "+a);
		}
		else if(a<b){
			for(int i = 1; i<=a; i++){
				if(a%i==0 && b%i==0){
					gcd = i;
				}
			}
			lcm = (a * b)/gcd;
			System.out.println("LCM is "+lcm);
		}
		else{
			for(int i = 1; i<=b; i++){
				if(a%i==0 && b%i==0){
					gcd = i;
				}
			}
			lcm = (a * b)/gcd;
			System.out.println("LCM is "+lcm);
		}
	}
}