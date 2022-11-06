import java.util.*;
class LinkedListOperations
{
	
	static Node head;
	static Scanner sc = new Scanner(System.in);
	
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
	
	
	public static void addFirst()
    {
		System.out.println("------------------------------------------------");
		System.out.print("Enter new node data :");
		int newData=sc.nextInt();
        Node new_node=new Node(newData);
        new_node.next=head;
        head=new_node;
		System.out.println("New node successfully added to first position.");
    }
	
	public static void addLast()
    {
		System.out.println("------------------------------------------------");
        System.out.print("Enter new node data :");
		int newData=sc.nextInt();
		Node new_node = new Node(newData);
		if(head==null)
		{
			head=new Node(newData);
			return;
		}
		new_node.next=null;
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}
		last.next=new_node;
		System.out.println("New node successfully added to last position.");
	}
	
	
	public static void addAfter()
	{
		System.out.println("------------------------------------------------");
        System.out.print("Enter new node data :");
		int newData=sc.nextInt();
		System.out.print("after which  node you have to add new node :");
		int node=sc.nextInt();
		
		Node current=head;
		int start=1;
        for(int i=1;i<node;i++)
		{
			current=current.next;
		}
		
		if (current==null) 
		{
			System.out.println("The given previous node cannot be null");
			return;
		}
 
		Node new_node = new Node(newData);
		new_node.next = current.next;
		current.next = new_node;
		System.out.println("New node successfully added after "+node+" position.");
	}
	
	static public void delFirst()
	{
		System.out.println("------------------------------------------------");
        head=head.next;
		System.out.println("first node successfully deleted.");
	}
	static public void delLast()
	{
		System.out.println("------------------------------------------------");
		Node slnode=head;
		while(slnode.next.next!=null)
		{
			slnode=slnode.next;
		}
		slnode.next=null;
	   
		System.out.println("last node successfully deleted.");
	}
	
	static public void delAfter()
	{
		System.out.println("------------------------------------------------");
		System.out.print("Which element you want to delete :");
		int key=sc.nextInt();
		Node temp=head,prev=null;
        if(temp != null && temp.data == key) 
		{
            head=temp.next;
            return;
        }
        while(temp!=null && temp.data!=key) 
		{
            prev = temp;
            temp = temp.next;
        }
        if(temp == null)
            return;
        prev.next = temp.next;
		System.out.print("Successfully deleted :"+key);
	}
	public static void printList()
    {
		System.out.println("------------------------------------------------");
		System.out.print("LINKED LIST = ");
        Node n=head;
        while(n!=null) 
		{
            System.out.print(n.data+"--->");
            n=n.next;
        }
		System.out.print("null");
    }
	
	public static void printIndex()
	{
		System.out.println("------------------------------------------------");
        System.out.print("Enter Index to be Print :");
		int id=sc.nextInt();
		Node start=head;
		int sid=1;
		while(sid!=id)
		{
			start=start.next;
			sid++;
		}
		System.out.print("Element at "+id+" is "+start.data);
	}
	
	public static void search()
    {
		System.out.println("------------------------------------------------");
        System.out.print("Enter node to be search :");
		int sdata=sc.nextInt();
		Node current=head;
		int num=1;
		int flag=0;
        while(current!=null)
		{
            if(current.data==sdata)
			{
                flag=1;
				break;
			}
            else
			{
				current = current.next;
				num++;
			}
        }
	
		if(flag==1)
		{
			System.out.print(sdata+" found at "+num+" node.");
		}
		else
			System.out.print(sdata+" Not found in linkedlist.");  
    }
	
	static public int count()
	{
		System.out.println("------------------------------------------------");
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	static public void deleteAll()
	{
		head=null;
		System.out.println("All Elements are Deleted From LinkedList..");
	}	
	
	static public int reverseIndex()
	{
		System.out.println("Enter The position of element from starting .");
		int pos=sc.nextInt();
		int revPos=count()+1-pos;
		return revPos;
	}
	
	static void reverse()
    {
        Node prev=null;
        Node current =head;
        Node next=null;
        while(current != null) 
		{
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node = prev;
        head=node;
    }
 
	public static void main(String[] args)
	{
		
		System.out.println("==========LinkedList Operation==========");
		int ch;
		do
		{
			System.out.println();	
			System.out.println("------------------------------------------");
			System.out.println("What Action you have to perform ::");
			System.out.println("1. Display List ");
			System.out.println("2. Add Node ");
			System.out.println("3. Delete Node");
			System.out.println("4. Search Node ");
			System.out.println("5. Length of Linked List ");
			System.out.println("6. Reverse position ");
			System.out.println("7. Exit ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					char ch3;
					System.out.println("  a) All elements.");
					System.out.println("  b) Specific element.");
					sc.nextLine();
					ch3=sc.nextLine().charAt(0);
					switch(ch3)
					{
						case 'a':printList();
								break;
						case 'b':printIndex();
								break;
						
						default : System.out.println("wrong choice");
						
					}
					break;
				case 2:
					char ch1;
					System.out.println("  a) At First position.");
					System.out.println("  b) At Last position.");
					System.out.println("  c) At Specific position.");
					sc.nextLine();
					ch1=sc.nextLine().charAt(0);
					switch(ch1)
					{
						case 'a':addFirst();
								break;
						case 'b':addLast();
								break;
						case 'c':addAfter();
								break;
						default : System.out.println("wrong choice");
						
					}
					break;
					
				case 3:
					char ch2;
					System.out.println("  a) At First position.");
					System.out.println("  b) At Last position.");
					System.out.println("  c) Specific Element");
					System.out.println("  d) Delete entire LinkedList.");
					sc.nextLine();
					ch2=sc.nextLine().charAt(0);
					switch(ch2)
					{
						case 'a':delFirst();
								break;
						case 'b':delLast();
								break;
						case 'c':delAfter();
								break;
						case 'd':deleteAll();
								break;
						default : System.out.println("wrong choice");
						
					}
					break;
				case 4:
						search();
						break;
				case 5:
						System.out.println("Length of LinkedList is "+count());
						break;
				case 6:System.out.println("Reverse Index of element is "+reverseIndex());
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