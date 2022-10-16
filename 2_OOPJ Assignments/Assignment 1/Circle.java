import java.util.*;

class Circle{
	
	final float PI = 3.147f;
	float radius;
	float area;
	float circumference;
	
	void calculate(float radius){
		area = PI * radius * radius;
		circumference = 2 * PI * radius;
	}
	
	void printDet(){
		System.out.println("Area of circle = "+area);
		System.out.println("Circumference of circle = "+circumference);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of Circle: ");
		
		float r = sc.nextFloat();
		
		Circle c = new Circle();
		c.calculate(r);
		c.printDet();
	}
}