import java.util.Scanner;

class Q6LeapYear{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		
		if(n%4==0){
			
			if(n%400==0){
				System.out.println("Year "+n+" is a Leap Year");
			}				
			
			else if(n%100==0){
				System.out.println("Year "+n+" is not a Leap Year");
			}	
			
			else{
				System.out.println("Year "+n+" is a Leap Year");
			}				
		}
		else{
			System.out.println("Year "+n+" is Not a Leap Year");
		}
		
	}
}