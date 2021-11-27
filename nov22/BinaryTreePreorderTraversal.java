package javadsa;

class Node{
	int key;
	Node left, right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(5);
		root.right.left = new Node(6);
		root.left.left = new Node(4);
		
		preOrder(root);
	}	
		
	public static void preOrder(Node root) {
		
		if(root==null) return;
		
		System.out.print(root.key+",");
		preOrder(root.left);
		preOrder(root.right);
	}
		
		
}
