class Tree
{
	static Node root;
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data = d;
			left = null;
			right = null;
		}
	}
	static void displayPreOrder(Node n)  // data-Left-right
	{
		if(n == null)
			return;
		System.out.print(n.data+" ");  // data = root value
		displayPreOrder(n.left);
		displayPreOrder(n.right);		
	}
	static void preOrder()
	{
		System.out.println("Tree in preOrder");
		displayPreOrder(root);
	}
	//===============================================
	static void displayInOrder(Node n)  // Left-data-right
	{
		if(n == null)
			return;
		displayInOrder(n.left);
		System.out.print(n.data+" ");  // data = root value
		displayInOrder(n.right);		
	}
	static void inOrder()
	{
		System.out.println("Tree in inOrder");
		displayInOrder(root);
	}
	//===============================================
	static void displayPostOrder(Node n)  // Left-right-data
	{
		if(n == null)
			return;
		displayPostOrder(n.left);
		displayPostOrder(n.right);
		System.out.print(n.data+" ");		
	}
	static void postOrder()
	{
		System.out.println("Tree in postOrder");
		displayPostOrder(root);
	}
	
	
	public static void main(String args[])
	{
		root = new Node (5);
		root.left = new Node(8);
		root.right = new Node(7);
		
		root.left.left = new Node(11);
		root.left.right = new Node(17);
		
		root.right.left = new Node(19);
		root.right.right = new Node(20);
		
		preOrder();
		System.out.println();
		
		inOrder();
		System.out.println();
		
		postOrder();
		System.out.println();
		
	}
}

/*

Tree in preOrder
5 8 11 17 7 19 20
Tree in inOrder
11 8 17 5 19 7 20
Tree in postOrder
11 17 8 19 20 7 5

*/