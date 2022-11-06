import java.util.*;
class StackOperationUsingLL 
{
	static Scanner sc=new Scanner(System.in);
    static Node top=null;
	static int max=5;
	static int count=0;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
    static void push()
    {
		System.out.println("------------------------------------------");
		System.out.print("Enter Element to push in stack :");
		int x=sc.nextInt();
		if(count>max-1)
		{
			System.out.println("Stack Overflow..!!");
		}
		else
		{
			Node new_node=new Node(x);
			new_node.next=top;
			top=new_node;
			count++;
			System.out.println(x+" Push to Stack.");
		}
    }
  
    static void pop()
    {
		System.out.println("------------------------------------------");
        if(top==null) 
		{
            System.out.println("Stack Underflow..!!! Can not pop element..!!");
        }
        else
		{ 
			int x=top.data;
			top=top.next;
			System.out.println(x+" Pop from Stack");
        }
    }
  
	static boolean isEmpty()
    {
        return(top==null);
    }
	
	
    static void peek()
    {
		System.out.println("------------------------------------------");
        if(top==null) 
		{
            System.out.println("Stack Underflow");
           
        }
        else 
		{
            System.out.println("Peek element is "+top.data);
        }
    }
     
	static int count()
	{
		return count;
	}
	
	
    static void print()
	{
		System.out.println("------------------------------------------");
		Node node=top;
		if(node==null)
		{
			System.out.println("Stack is Empty. Nothing to print .");
		}
		int topp=count-1;
		System.out.println("Stack Elements :-");
		while(node!=null)
		{
			System.out.println(node.data+"--->"+topp+" index.");
			node=node.next;
			topp--;
		}
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