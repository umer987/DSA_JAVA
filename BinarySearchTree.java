package dsap1;



public class BinarySearchTree {
    static class Node{
    	int data;
    	Node left;
    	Node right;
    	Node(int data){
    		this.data=data;
    	}
    	
    }
	
	
	public static Node insert(Node root ,int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data  > val) {
			root.left = insert(root.left , val);
			return root;
		}
		else {
			root.right= insert(root.right , val);
			
		}
		return root;
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(Node root) {
		if(root == null ) {
			return;
			}
		postorder(root.left);
		postorder(root.right );
		System.out.println(root.data);
	}
	
	
	public static boolean search(Node root , int key) {
		if(root == null) {
			return false;
		}
		if (root.data > key) {
			return search(root.left , key);
		}
		else if ( root.data == key) {
			return true;
		}
		else {
			return search(root.right , key);
		}
	}
	
	
	
	public static Node delete(Node root, int key) {
	    if (root == null) return null;

	    // Go left if key is smaller
	    if (key < root.data) {
	        root.left = delete(root.left, key);
	    }

	    // Go right if key is bigger
	    else if (key > root.data) {
	        root.right = delete(root.right, key);
	    }

	    // Key found — time to delete
	    else {
	        // Case 1: No left child
	        if (root.left == null) return root.right;

	        // Case 2: No right child
	        if (root.right == null) return root.left;

	        // Case 3: Two children
	        // Find smallest in right subtree
	        Node min = findMin(root.right);

	        // Copy that value here
	        root.data = min.data;

	        // Delete that min node
	        root.right = delete(root.right, min.data);
	    }

	    return root;
	}

	// Helper: find minimum node
	public static Node findMin(Node root) {
	    while (root.left != null) {
	        root = root.left;
	    }
	    return root;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int values[]= {8,5,3,1,4,6,10,11,14};
		Node root = null;
		for (int i = 0; i < values.length; i++) {
			root= insert(root , values[i]);
		}
		
		System.out.println();
		int key = 1;
		if (search(root ,key)) {
			System.out.println("FOUND " + key);
		}
		else  {
			System.out.println("NOT FOUND "+ key);
		}
		
		System.out.println("IN-ORDER");
		inorder(root);
		System.out.println("PRE-ORDER");
		preorder(root);
		System.out.println("POST-ORDER");
		postorder(root);
		System.out.println();
		delete(root, 11);
		inorder(root);

	}
}