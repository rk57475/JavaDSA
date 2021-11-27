package javadsa;

public class BinaryTreeGetKthLevelElement {

	public static void getKthLevel(Node root, int kthlevel) {
		if(root == null) return;
		
		if(kthlevel==0) {
			System.out.println(root.key);
		}
		
		getKthLevel(root.left, --kthlevel);
		getKthLevel(root.right, kthlevel);
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
		
		getKthLevel(root, 3);
	}
}
