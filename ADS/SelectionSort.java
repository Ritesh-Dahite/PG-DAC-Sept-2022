import java.util.*;

public class SelectionSort
{
    static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
			{
                if(arr[j]<arr[min])
				{
                    min=j;
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
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
		selectionSort(arr);
        System.out.println("Sorted array");
        display(arr);
    }
}