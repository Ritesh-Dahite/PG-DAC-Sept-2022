class BinaryTree1
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
	
	static void printPreOrder(Node n)		//data -> left -> right
	{
		if(n == null)
			return;
		
		System.out.print(n.data+" ");
		printPreOrder(n.left);
		printPreOrder(n.right);
	}
	
	static void PreOrder()
	{
		printPreOrder(root);
	}
	
	static void printInOrder(Node n)		//left -> data -> right
	{
		if(n == null)
			return;
		
		printInOrder(n.left);
		System.out.print(n.data+" ");
		printInOrder(n.right);
	}
	
	static void InOrder()
	{
		printInOrder(root);
	}
	
	static void printPostOrder(Node n)		//left -> right -> data
	{
		if(n == null)
			return;
		
		printPostOrder(n.left);
		printPostOrder(n.right);
		System.out.print(n.data+" ");
	}
	
	static void PostOrder()
	{
		printPostOrder(root);
	}
	
	public static void main(String args[])
	{
		root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		
		System.out.println("Pre Order =>");
		PreOrder();
		System.out.println("\nIn Order =>");
		InOrder();
		System.out.println("\nPost Order =>");
		PostOrder();
	}
}