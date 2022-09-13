import java.util.Scanner;

class Q18PrimeFac{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		for(int i = 2; i < num; i++){
			while(num%i==0){
				System.out.println(i+" ");
				num = num/i;
			}
		}
		if(num>2){
			System.out.println(num);
		}
	}
}