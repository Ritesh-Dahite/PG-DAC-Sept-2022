import java.util.Scanner;

class Q11Smallest{
	
	public static void main (String args[]){
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = s.nextInt();
		
		System.out.print("Enter second number: ");
		int b = s.nextInt();
		
		System.out.print("Enter third number: ");
		int c = s.nextInt();
		
		System.out.println();
		
		if(a<b&&a<c){
			System.out.println("First number "+a+" is smallest");
		}
		
		else if(b<c){
			System.out.println("Second number "+b+" is smallest");
		}
		
		else{
			System.out.println("Third number "+c+" is smallest");
		}
	}
}