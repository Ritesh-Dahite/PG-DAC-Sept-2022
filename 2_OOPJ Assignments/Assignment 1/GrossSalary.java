import java.util.*;

class GrossSalary{
	
	static float lessSal(int sal){
		float hra, da, fsal = sal;
		hra = ((10*fsal)/100);
		da = ((90*fsal)/100);
		return (fsal + hra + da);
	}
	
	static float moreSal(int sal){
		float da, fsal = sal;
		da = ((98*fsal)/100);
		return (fsal + da + 2000);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Basic Salary: ");
		int baslry = sc.nextInt();
		float gsal;
		
		if(baslry<10000){
			gsal = lessSal(baslry);
			System.out.println("The Gross Salary is: "+gsal+" Rs.");
		}
		else if(baslry>=10000){
			gsal = moreSal(baslry);
			System.out.println("The Gross Salary is: "+gsal+" Rs.");
		}
	}
}