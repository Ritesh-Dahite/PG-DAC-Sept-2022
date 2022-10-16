import java.util.*;

class DateDemo{
	int day;
	int month;
	int year;
	
	DateDemo(){
		day = 1;
		month = 1;
		year = 1970;
	}
	
	DateDemo(int day){
		this();
		this.day = day;
	}
	
	DateDemo(int day, int month){
		this();
		this.day = day;
		this.month = month;
	}
	
	DateDemo(int day, int month, int year){
		this();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void printPrev(){
		
	}
	
	void printDay(){
		System.out.println("Todays Date is :"+day+"/"+month+"/"+year);
	}
	
	void printNext(){
		
	}
	
	funDay();
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day: ");
		int x = sc.nextInt();
		System.out.print("Enter month: ");
		int y = sc.nextInt();
		System.out.print("Enter year: ");
		int z = sc.nextInt();
		
		DateDemo dobj = new DateDemo();
		dobj.printDay();
		dobj.funDay();
		dobj.funMon();
	}
}