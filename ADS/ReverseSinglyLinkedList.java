import java.util.*;

class ReverseSinglyLinkedList
{
	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	static void insertAtStart(int new_data)
	{
		
		if(head == null)
		{
			head = new Node(new_data);
			return;
		}
		
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		head = new_node;
	}
	
	static void insertAtEnd(int new_data)
	{
		Node new_node = new Node(new_data);
		
		Node temp = head;
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new_node;
	}
	
	static void insertAfterKey(int new_data, int key)
	{
		if(head == null)
		{
			System.out.println(key+" not found in the list.");
			return;
		}
		
		Node temp = head;
		Node new_node = new Node(new_data);
		
		while(temp != null && temp.data != key)
		{
			temp = temp.next;
		}
		
		if(temp == null)
		{
			System.out.println(key+" not found in the list.");
			return;
		}
		
		new_node.next = temp.next;
		temp.next = new_node;		
	}
	
	static void deletionAfterPos(int pos)
	{
		int i = 1, count =0;
		
		if(head == null)
		{
			System.out.println("The list is empty.");
			return;
		}
		
		Node temp = head;
		
		if(pos == 1)
		{
			head = temp.next;
			return;
		}
		
		while(temp != null && i < pos-1)
		{
			temp = temp.next;
			++i;
			count++;
		}
		
		if(temp == null)
		{
			System.out.println("Total number of elements is less so cannot delete element at position "+pos);
			return;
		}
		temp.next = temp.next.next;
	}
	
	static void deleteAtStart()
	{
		if(head == null)
		{
			System.out.println("The list is empty.");
			return;
		}
		
		Node temp = head;
		head = temp.next;
	}
	
	static void deleteAtEnd()
	{
		if(head == null)
		{
			System.out.println("The list is empty.");
			return;
		}
		
		Node temp = head;
		
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = null;
		
	}
	
	static void deletionOfKey(int key)
	{
		if(head == null)
		{
			System.out.println("The list is empty.");
			return;
		}
		
		Node temp = head;
		Node track = null;
		
		while(temp != null && temp.data != key)
		{
			track = temp;
			temp = temp.next;
		}
			
		if(temp == null)
		{
			System.out.println(key+" not found in the list");
			return;
		}
		
		track.next = track.next.next;
	}
	
	static void reverseList()
	{
		if(head == null)
		{
			System.out.println("The list is empty.");
			return;
		}
		
		Node prev = null;
		Node curr = head;
		Node temp = null;
		
		while(curr != null)
		{
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
	}
	
	
	static void printLinkList()
	{
		if(head == null)
		{
			System.out.println("The list is empty.");
			return;
		}
		
		Node temp = head;

		//System.out.println("Data at temp.next.next => "+temp.next.next.data);		//<-- Its working
		
		System.out.println("The data/elements in the list are as follows :");
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		printLinkList();
		
		System.out.print("Enter the number of elements you want to add to the list : ");
		int n = sc.nextInt();
		int val, key;
		
		for(int i = 1; i <= n; i++)
		{
			System.out.print("Enter the data/element : ");
			val = sc.nextInt();
			insertAtEnd(val);
		}
		printLinkList();
		
		System.out.print("Insert a number you want at 1st position in list : ");
		val = sc.nextInt();
		insertAtStart(val);
		
		System.out.print("Insert a number you want in list : ");
		val = sc.nextInt();
		System.out.print("Insert the key element from the list : ");
		key = sc.nextInt();
		insertAfterKey(val, key);
		
		System.out.print("Insert a number you want at last position in list : ");
		val = sc.nextInt();
		insertAtEnd(val);
		
		System.out.println("List --->");
		printLinkList();
		
		System.out.println("Reverse of List --->");
		reverseList();
		printLinkList();
		
		System.out.println("Deleting element which is at 1st position of list =>");
		deleteAtStart();
		printLinkList();
		
		System.out.println("Deleting element which is at last position of list =>");
		deleteAtEnd();
		printLinkList();
		
		System.out.print("Enter a number which you want to delete from the list =>");
		val = sc.nextInt();
		deletionOfKey(val);
		printLinkList();
		
		System.out.println("Reverse of List --->");
		reverseList();
		printLinkList();
		
		
		//deletionAfterPos(1);
		//deletionAfterPos(3);
		deletionAfterPos(5);
		printLinkList();
	}
}