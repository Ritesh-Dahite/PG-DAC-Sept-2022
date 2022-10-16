import java.util.*;

class MathOperation{
	static int add(int a, int b){
		return (a + b);
	}
	
	static int subtract(int a, int b){
		if(a > b){
			return (a - b);
		}
		else{
			return (b - a);
		}
	}
	
	static int multiply(int a, int b){
		return (a * b);
	}
	
	static int power(int a, int b){
		return (int)(Math.pow(a, b));
	}
}

class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		int add = MathOperation.add(a, b);
		int sub = MathOperation.subtract(a, b);
		int multiply = MathOperation.multiply(a, b);
		int power = MathOperation.power(a, b);
		
		System.out.println("Addition ="+add);
		System.out.println("Subtraction ="+sub);
		System.out.println("Multiplication ="+multiply);
		System.out.println("Power of first number raised to second ="+power);
	}
}