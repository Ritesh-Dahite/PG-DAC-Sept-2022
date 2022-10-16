import java.util.*;

class StudentDetails{
	String name;
	double sub1;
	double sub2;
	double sub3;
	double totalMarks;
	double avg;
	
	static Scanner sc = new Scanner(System.in);
	
	void getDet(){
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		
		System.out.print("Enter marks obtained in 1st subject: ");
		sub1 = sc.nextDouble();
		
		System.out.print("Enter marks obtained in 2nd subject: ");
		sub2 = sc.nextDouble();
		
		System.out.print("Enter marks obtained in 3rd subject: ");
		sub3 = sc.nextDouble();
		
		marksCal();
	}
	
	void marksCal(){
		totalMarks = (sub1 + sub2 + sub3);
		avg = (totalMarks/3);
	}
	
	void printDet(){
		System.out.println("Name of Student: "+name);
		System.out.println("Total Marks obtained: "+totalMarks);
		System.out.println("Average Marks obtained: "+avg);
	}
}

class Student{
	public static void main(String args[]){
		StudentDetails s1 = new StudentDetails();
		s1.getDet();
		s1.printDet();
	}
}