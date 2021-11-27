package javadsa;

class Node{
	int key;
	Node left, right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTreeLeafNodes {
	public static int printLeafNode(Node root) {
		if(root==null) {
			return -1;
		}
		int l = printLeafNode(root.left);
		int r = printLeafNode(root.right);
		if(l==-1 && r==-1) {
			System.out.println(root.key);
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(5);
		root.right.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right.left.left = new Node(9);
		root.left.right.left = new Node(7);
		root.right.right.left = new Node(10);
		
		printLeafNode(root);
	}
	
}
