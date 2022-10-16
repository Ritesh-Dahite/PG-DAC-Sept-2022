import java.util.*;

class SimpleInterest{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Principal Amount: ");
		int principal = sc.nextInt();
		
		System.out.print("Enter the Rate of Interest in %: ");
		float interest = sc.nextFloat();
		
		System.out.print("Enter the Duration of loan in Years: ");
		int duration = sc.nextInt();
		
		float simpint = ((principal*interest*duration)/100);
		
		float finalamt;
		finalamt = (principal+simpint);
		
		System.out.println("Simple Interest: "+simpint);
		System.out.println("Final Amount: "+finalamt);
		
	}
}