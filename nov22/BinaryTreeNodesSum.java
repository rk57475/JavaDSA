package javadsa;

class Node{
	int key;
	Node left, right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTreeNodesSum {

	public static int sumAllNodes(Node root) {
		if(root == null) return 0;
		
		int l = sumAllNodes(root.left);
		int r = sumAllNodes(root.right);
		
		return root.key+l+r;
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
		root.right.right.left = new Node(4);
		
		System.out.println(sumAllNodes(root));
	}
}
