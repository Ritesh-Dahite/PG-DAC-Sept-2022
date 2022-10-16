import java.util.*;

class Room{
	int height;
	int width;
	int breadth;
	
	void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of room in meters: ");
		height = sc.nextInt();
		
		System.out.print("Enter width of room in meters: ");
		width = sc.nextInt();
		
		System.out.print("Enter breadth of room in meters: ");
		breadth = sc.nextInt();
	}
	
	void printDetails(){
		System.out.println("Entered height of room is: "+height+" meters.");
		System.out.println("Entered width of room is: "+width+" meters.");
		System.out.println("Entered breadth of room is: "+breadth+" meters.");
	}
	
	int volume(){
		return (height * width * breadth);
	}
}

class RoomDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Room r1 = new Room();
		
		r1.getInput();
		System.out.println();
		
		r1.printDetails();
		System.out.println();
		
		int vol = r1.volume();
		System.out.println("Volume of the room is: \""+vol+"\" cubic meters.");
	}
}