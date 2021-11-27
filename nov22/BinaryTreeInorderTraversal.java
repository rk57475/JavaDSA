package javadsa;

class Node{
	int key;
	Node left, right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTreeInorderTraversal {
	
	public static void inOrder(Node root) {
		
		if(root==null) return;
		
		inOrder(root.left);
		System.out.print(root.key+",");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(5);
		root.right.left = new Node(6);
		root.left.left = new Node(4);
		
		inOrder(root);
	}	
		
		
		
		
}
