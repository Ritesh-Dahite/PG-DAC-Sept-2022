import java.util.Scanner;

class Q9Factor{
	
	public static void main (String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		int num = s.nextInt();
		int n = 1;
		
		if(num<=0){
			System.out.println("Enter Positive number and try again...");
		}
		
		else{	
			
			System.out.println("The Factors of Given Number are: ");
			
			while(n<=num){
				
				if(num%n==0){
					System.out.println(n);
				}
			n++;
			}
		}
	}
	
}