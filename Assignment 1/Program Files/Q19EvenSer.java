import java.util.Scanner;

class Q19EvenSer{
	
	public static void main (String args[]){
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter n number of terms to be printed in even number series: ");
		
		int n = s.nextInt();
		
		System.out.println();
		
		int even = 2;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(even+" ");
			even = even+2;
		}
	}
}