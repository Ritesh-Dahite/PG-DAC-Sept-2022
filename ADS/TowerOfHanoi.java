import java.util.*;

class TowerOfHanoi
{
	static void toh(int n, char from, char via, char to)
	{
		if(n == 1)
		{
			System.out.println("Move disk from rod "+from+" to rod "+to);		
			return;
		}
		
		toh(n-1, from, to, via);
		System.out.println("Move disk from rod "+from+" to rod "+to);
		toh(n-1, via, from, to);
	}
	
	public static void main(String args[])
	{
		//long start = System.nanoTime();									-->To calculate time
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disk");
		int disk = sc.nextInt();
		
		toh(disk, 'A', 'B', 'C');
		
		//long duration = (System.nanoTime() - start)/1000000;				-->To calculate time
		//System.out.println("\nTime in milli second : "+duration);			-->To calculate time
	}
}