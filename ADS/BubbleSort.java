import java.util.*;

public class BubbleSort
{
    static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
		{
            for(int j=0;j<n-i-1;j++)
			{
                if (arr[j]>arr[j+1]) 
				{
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
			}
		}
	}
 
    
    static void display(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array :");
		int size=sc.nextInt();
		System.out.print("Enter Array Elements :");
        int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Unsorted array");
        display(arr);
		bubbleSort(arr);
        System.out.println("Sorted array");
        display(arr);
    }
}