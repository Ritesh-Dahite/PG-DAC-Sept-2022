class BinarySearchTree1
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
	
	static Node insert(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		
		if(root.data < key)
		{
			root.right = insert(root.right, key);
		}
		
		else if(root.data > key)
		{
			root.left = insert(root.left, key);
		}
		
		return root;
	}
	
	static void insertset(int key)
	{
		root = insert(root, key);
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
		insertset(25);
		insertset(30);
		insertset(15);
		insertset(55);
		insertset(5);
		insertset(75);
		insertset(35);
		
		/*
		System.out.println("Pre Order =>");
		PreOrder();
		*/
		System.out.println("\nIn Order =>");
		InOrder();
		/*
		System.out.println("\nPost Order =>");
		PostOrder();
		*/
	}
}