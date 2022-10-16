import java.util.*;

class Subject{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		float sum = 0.0f, percentage = 0.0f;
		
		System.out.print("Enter total number of subjects: ");
		int no_sub = sc.nextInt();
		
		float marks[] = new float[no_sub];
		
		for(int i = 0; i < marks.length; i++){
			System.out.print("Enter marks out of 100 for subject number "+(i+1)+" : ");
			marks[i] = sc.nextFloat();
			sum = sum + marks[i];
		}
		percentage = ((sum * 100)/(no_sub * 100));
		
		System.out.println("Total marks obtained = "+sum);
		System.out.println("Percentage marks = "+percentage+" %");
	}
}