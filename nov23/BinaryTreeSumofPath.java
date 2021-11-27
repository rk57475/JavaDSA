package javadsa;

class Node{
	int key;
	Node left, right;
	
	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTreeSumofPath {

	private static boolean sumPath(Node root, int sum, int targetSum){
        if(root==null) return false;
        
        sum = sum + root.key;
        
        if(root.left == null && root.right == null){
           if(sum==targetSum) return true;
            
        }
        
        return (sumPath(root.left,sum, targetSum) || sumPath(root.right,sum, targetSum));
        
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
		
		if(sumPath(root,0,18)) System.out.println("True");
		else System.out.println("False");
	}
}
