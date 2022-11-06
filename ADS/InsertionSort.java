import java.util.*;

public class InsertionSort
{
    static void insertSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++) 
		{
            int key=arr[i+1];
            int j=i;
            while(j >= 0 && arr[j] > key) 
			{
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
			display(arr);
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
		insertSort(arr);
        System.out.println("Sorted array");
        display(arr);
    }
}