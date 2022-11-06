import java.util.*;
class DoubleLinkedListOperations
{
	
	static Node head=null;
	static Scanner sc = new Scanner(System.in);
	
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
	}
	
	
	static void display()
	{
		Node start=head;
		Node current=null;
		System.out.println("Forward :-> ");
		while(start!=null)
		{
			System.out.print(start.data+"-->");
			current=start;
			start=start.next;
		}
		
		System.out.println("\nBackward :-> ");
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.prev;
		}
		System.out.println();
	}
	
	
	
	static void insertAtBegining()
	{
		System.out.println("------------------------------------------------");
		System.out.print("Enter new node data :");
		int new_data=sc.nextInt();
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		
		if(head!=null)
		{
			head.prev=new_node;
		}
		head=new_node;
		System.out.println("New node successfully added to first position.");
	}
	
	public static void addBetween()
	{
		
		System.out.println("------------------------------------------------");
        System.out.print("Enter new node data :");
		int new_data=sc.nextInt();
		System.out.print("after which node you have to add new node :");
		int key=sc.nextInt();
		Node prev_Node=head;
		for(int i=1;i<key;i++)
		{
			prev_Node=prev_Node.next;
		}
		if(prev_Node==null) 
		{
			System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node new_node = new Node(new_data);
	 
		new_node.next = prev_Node.next;
	 
		prev_Node.next = new_node;
	 
		new_node.prev = prev_Node;
	 
		if(new_node.next!=null)
        new_node.next.prev=new_node;
		System.out.println("New node successfully added after "+key);
	}
	
	static void insertAtLast()
	{
		Node current=head;
		System.out.println("------------------------------------------------");
		System.out.print("Enter new node data :");
		int new_data=sc.nextInt();
		Node new_node = new Node(new_data);
		if(current==null)
		{
			new_node.prev=null;
			current=new_node;
			System.out.println("New node successfully added to Last position.");
			head=current;
			head.next=null;
			return;
		}
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=new_node;
		new_node.prev=current;
		new_node.next=null;
		
		System.out.println("New node successfully added to Last position.");
	}
	
	static void reverseList()
	{
		
		Node left=head,right=head;
		while(right.next!=null)
			right=right.next;
		
		while(left!=right && left.prev!=right)
		{
			int t=left.data;
			left.data=right.data;
			right.data=t;
			left=left.next;
			right=right.prev;
		}
		System.out.println("List Reversed Successfully.");
	}
 
 
	public static void search()
    {
		System.out.println("------------------------------------------------");
		System.out.print("Enter node data to be search :");
		int key=sc.nextInt();
		int count=1;
        Node current=head;
        while (current != null) 
		{
            if (current.data == key)
			{
                System.out.println("Element Found at "+count+" position.");
				break;
			}
            current = current.next;
			count++;
        }
		if(count==1)
			System.out.println("Element Not Found");
    }
	
	
	static void delFirst()
	{
		if(head==null)
		{
			System.out.println("List is already empty.");
		}
		else
		{
			head=head.next;
			head.prev=null;
			System.out.println("First node deleted Successfully.");
		}
	}
	
	static void lastDelete()
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
	static void deleteNode()
    {
		Node del=head;
		System.out.println("------------------------------------------------");
		System.out.print("Enter node to be delete :");
		int key=sc.nextInt();
		for(int i=1;i<key;i++)
		{
			del=del.next;
		}
		
        if (head == null || del == null) 
		{
            return;
        }
        if (head == del) 
		{
            head = del.next;
        }
        if (del.next != null) 
		{
            del.next.prev = del.prev;
        }
        if (del.prev != null) 
		{
            del.prev.next = del.next;
        }
		System.out.print("Node "+key+" Deleted Successfully.");
    }
	
	static void delAll()
	{
		head=null;
		System.out.println("All Elements are Deleted From LinkedList..");
		
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
	public static void main(String[] args)
	{
		
		System.out.println("==========Double LinkedList Operation==========");
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
			System.out.println("6. Reverse List ");
			System.out.println("7. Exit ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					display();
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
						case 'a':insertAtBegining();
								break;
						case 'b':insertAtLast();
								break;
						case 'c':addBetween();
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
						case 'b':lastDelete();
								break;
						case 'c':deleteNode();
								break;
						case 'd':delAll();
								break;
						default : System.out.println("wrong choice");
					
					}
				case 4:
						search();
						break;
				case 5:
						System.out.println("Length of LinkedList is "+count());
						break;
				case 6:reverseList();
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
	