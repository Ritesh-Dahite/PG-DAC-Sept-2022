import java.util.*;

class FarToCel{
	
	
	static float calFarToCel(float x){
		return(5*(x-32)/9);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		float tempf = sc.nextInt();
		float tempc = calFarToCel(tempf);
		System.out.println("Temperature in Celsius: "+tempc);
	}
}