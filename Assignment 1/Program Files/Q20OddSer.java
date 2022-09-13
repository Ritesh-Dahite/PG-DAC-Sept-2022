import java.util.Scanner;

class Q20OddSer{
	
	public static void main (String args[]){
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter n number of terms to be printed in odd number series: ");
		
		int n = s.nextInt();
		
		System.out.println();
		
		int odd = 1;
		
		for(int i=1;i<=n;i++){
		  
			System.out.print(odd+" ");	
			odd=odd+2;
		}
	}
}