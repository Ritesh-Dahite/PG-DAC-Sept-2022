class BSTree
{
	static Node root;
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			left = null;
			right = null;
			data = d;
		}
	}
	static Node insert(Node root,int key)
	{
		if(root==null)
		{
			root = new Node(key);
			return root;
		}
		else if(key > root.data)
			root.right = insert(root.right,key);
		else if(key< root.data)
			root.left = insert(root.left,key);
		return root;
	}
	static void printinsert(int key)
	{
		root = insert(root,key);
	}
	static void inorder(Node root)
	{
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);		
	}
	
	static void deletion()
	{
		if(root==null)
		{
			System.out.println("Tree is null");
			return;
		}
		else(..........................................
	}
	
	
	
	
	
	public static void main(String args[])
	{
		printinsert(10);
		printinsert(5);
		printinsert(7);
		printinsert(11);
		printinsert(3);
		printinsert(21);
		System.out.print("In-order :============>");
		inorder(root);
	}
}

/*
In-order :============>3 5 7 10 11 21

*/