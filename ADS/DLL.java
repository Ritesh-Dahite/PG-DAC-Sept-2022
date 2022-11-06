class DLL
{
	static Node head;
	
	static class Node
	{
		int data;
		Node prev, next;
		
		Node(int d)
		{
			data = d;
			prev =  null;
			next =  null;
		}	
	}
	
	static void insertAtStart(int new_data)
	{
		Node new_node = new Node(new_data);
		
		if(head == null)
		{
			head = new_node;
		}
		else
		{
			new_node.next = head;
			head.prev = new_node;
		}
		head = new_node;
	}
	
	static void deletionAtStart()
	{
		Node temp = head;
		
		if(head == null)
			return;
		else
		{
			head = temp.next;
			head.prev = null;
		}
	}
	
	static void deletionAtPos(int a)
	{
		Node temp = head;
		
		if(head == null)
			return;
		
		
		for(int i = 0; i < a-2; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		temp.next.prev = temp;
	}
	
	static void display()
	{
		Node n = head;
		
		if(n == null)
			return;
		
		while(n != null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Elements added : ");
		insertAtStart(5);
		insertAtStart(10);
		insertAtStart(15);
		insertAtStart(20);
		insertAtStart(25);
		insertAtStart(30);
		insertAtStart(35);
		
		display();
		deletionAtPos(4);
		System.out.println();
		display();
		deletionAtStart();
		System.out.println();
		display();
	}
}