import java.util.*;
class StackOperation 
{
	static Scanner sc=new Scanner(System.in);
    static final int MAX=5;
    static int top=-1;
    static int a[] = new int[MAX];
	
    static void push()
    {
		System.out.println("------------------------------------------");
		System.out.print("Enter Element to push in stack :");
		int x=sc.nextInt();
        if(top>=(MAX-1)) 
		{
            System.out.println("Stack Overflow ...!! Can not insert new element..!!");
        }
        else 
		{
            a[++top]=x;
            System.out.println(x + " Pushed into stack");
        }
    }
  
    static void pop()
    {
		System.out.println("------------------------------------------");
        if(top<0) 
		{
            System.out.println("Stack Underflow..!!! Can not pop element..!!");
        }
        else
		{
            int x=a[top--];
			System.out.println(x + " Pop from stack");
        }
    }
  
	static boolean isEmpty()
    {
        return(top<0);
    }
	
	
    static void peek()
    {
		System.out.println("------------------------------------------");
        if(top<0) 
		{
            System.out.println("Stack Underflow");
           
        }
        else 
		{
            System.out.println("Peek element is "+a[top]);
        }
    }
     
	static int count()
	{
		return top+1;
	}
	
	
    static void print()
	{
		if(top<0)
		{
			System.out.println("Stack is Empty. Nothing to print .");
		}
		for(int i=top;i>-1;i--)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}
	
    public static void main(String args[])
    {
      
		System.out.println("==========Stack Operation==========");
		int ch;
		do
		{	
			System.out.println("------------------------------------------");
			System.out.println("What Action you have to perform ::");
			System.out.println("1. PUSH ");
			System.out.println("2. POP ");
			System.out.println("3. Check Stack is EMPTY ");
			System.out.println("4. PEEK of STACK ");
			System.out.println("5. COUNT of STACK ");
			System.out.println("6. PRINT STACK ELEMENT ");
			System.out.println("7. Exit ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					push();
					break;
				case 2:
					pop();
					break;
					
				case 3:
					System.out.println("------------------------------------------");
					System.out.println("Stack Empty = "+isEmpty());
					break;
				case 4:
						peek();
						break;
				case 5:
						System.out.println("------------------------------------------");
						System.out.println("Count of Stack is "+count());
						break;
				case 6:print();
						break;
				case 7:
						System.out.println("Thank you...!!");
						break;
				default:
					System.out.println("Enter Valid Entry...!!!");
			}
		}while(ch!=7);
	}
}