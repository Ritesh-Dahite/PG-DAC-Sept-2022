import java.util.*;

class BoxPro{
	int height;
	int width;
	int breadth;
	int volume;
	int surfaceArea;
	
	BoxPro(){}
	
	BoxPro(int height, int width, int breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	int getVol(){
		volume = (height * width * breadth);
		return volume;
	}
	
	int getArea(){
		surfaceArea = ((height * width) + (width * breadth) + (height * breadth));
		return surfaceArea;
	}
	
	void printBoxDet(){
		System.out.println("Volume of box ="+getVol());
		System.out.println("Surface area of box ="+getArea());
	}
}

class Box{
	public static void main(String args[]){
		int h, w, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter box Height: ");
		h = sc.nextInt();
		System.out.print("Enter box Width: ");
		w = sc.nextInt();
		System.out.print("Enter box Breadth: ");
		b = sc.nextInt();
		
		BoxPro b1 = new BoxPro(h, w, b);
		b1.printBoxDet();
		
		System.out.println("---------------------------------------------");
		
		System.out.print("Enter box Height: ");
		h = sc.nextInt();
		System.out.print("Enter box Width: ");
		w = sc.nextInt();
		System.out.print("Enter box Breadth: ");
		b = sc.nextInt();
		
		BoxPro b2 = new BoxPro(h, w, b);
		b2.printBoxDet();

	}
}