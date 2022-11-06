import java.util.*;

class ArrayOperation
{
	int size;
	int[] array;
	Scanner sc = new Scanner(System.in);
	void initializeArray()
	{
		System.out.println("Enter Size of array : ");
		size=sc.nextInt();
		array=new int[size];
		System.out.println("Enter "+size+" elements :");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Array Created successfully.");
	}
	
	void display()
	{
		System.out.print("Array elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	void search()
	{
		System.out.print("Enter Element you want to search : ");
		int key=sc.nextInt();
		int found=0,loc=0;
		for(int i=0;i<size;i++)
		{
			if(array[i] == key)
			{
				found=1;
				loc=i;
				break;
			}
		}	
		if(found==1)
		{
			System.out.println("Element found at "+(loc+1)+" location.");
		}
		else
		{
			System.out.println("Element not found.");
		}
	}
	
	void delete()
	{
		System.out.print("Enter Element you want to delete : ");
		int key=sc.nextInt();
		int deleted=0,index=0;
		for(int i=0;i<size;i++)
		{
			if(array[i] == key)
			{
				deleted=1;
				index=i;
				break;
			}
			else
			{
				deleted=0;
			}
		}
		if(deleted==1)
		{
			for(int i=index+1;i<size;i++)
            {
                array[i-1]=array[i];
            }
			size--;
			System.out.println("Element deleted successfully.");
		}
		else
		{
			System.out.println("Element not present in array.");
		}
		
	}
	
	void add()
	{
		System.out.print("Enter Element you want to add : ");
		int key=sc.nextInt();
		System.out.print("Enter position for new element : ");
		int pos=sc.nextInt();
		int newar[]=new int[size+1];
		for (int i = 0; i<size+1;i++) 
		{
            if(i<pos-1)
                newar[i] = array[i];
            else if(i == pos-1)
                newar[i]=key;
            else
                newar[i]=array[i-1];
        }
		array=new int[size+1];
		for(int i=0;i<size+1;i++)
		{
			array[i]=newar[i];
		}
		size++;
		System.out.println("Element Added successfully.");
	}
	
	
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		ArrayOperation a=new ArrayOperation();
		System.out.println("==========Array Operation==========");
		int ch;
		do
		{
			System.out.println();	
			System.out.println("------------------------------------------");
			System.out.println(" What Action you have to perform ::");
			System.out.println(" 1. Initialize ");
			System.out.println(" 2. Display ");
			System.out.println(" 3. Search ");
			System.out.println(" 4. Delete ");
			System.out.println(" 5. Add ");
			System.out.println(" 6. Exit ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					a.initializeArray();
					break;
				case 2:
					a.display();
					break;
				case 3:
					a.search();
					break;
				case 4:
					a.delete();
					break;
				case 5:
					a.add();
					break;
				case 6:
					System.out.println(" Thank you...!!");
					break;
				default:
					System.out.println(" Enter Valid Entry...!!!");
			}
		}while(ch!=6);
	}	
}