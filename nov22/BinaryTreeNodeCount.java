package javadsa;

public class BinaryTreeNodeCount {
	
	public static int getCountOfNodes(Node root) {
			if(root == null) return 0;
			
			return 1+getCountOfNodes(root.left)+getCountOfNodes(root.right);
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
			
			System.out.println(getCountOfNodes(root));
	}
		
}
