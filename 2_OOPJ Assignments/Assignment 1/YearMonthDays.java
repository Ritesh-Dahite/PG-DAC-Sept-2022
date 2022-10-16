import java.util.*;

class YearMonthDays{
	static int y, m, d;
	
	/*
	static int years(int e){
		return (e/365);
	}
	
	static int months(int f){
		int rem;
		rem = (f%365);
		return (rem/30);
	}
	
	static int days(int g){
		int rem, rd;
		rem = (g%365);
		rd = (rem%30);
		return rd;
	}
	*/
	
	static void calYMD(int x){
		y = x/365;
		m = ((x%365)/30);
		d = ((x%365)%30);
		printCon();
	}
	
	static void printCon(){
		System.out.println("Number of Years: "+y);
		System.out.println("Number of Months: "+m);
		System.out.println("Number of Days: "+d);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days to get it converted into Years, Months & Days: ");
		int n = sc.nextInt();
		calYMD(n);
		
		/*
		//int y = years(n);
		//int m = months(n);
		//int d = days(n);
		//System.out.println(y);
		//System.out.println(m);
		//System.out.println(d);
		*/
	}
}