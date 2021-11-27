package javadsa;


class Node{
	int key;
	Node left, right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTreePostorderTraversal {

	public static void postOrder(Node root) {
		
		if(root==null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+",");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(5);
		root.right.left = new Node(6);
		root.left.left = new Node(4);
		
		postOrder(root);
	}	
		
	
		
}
