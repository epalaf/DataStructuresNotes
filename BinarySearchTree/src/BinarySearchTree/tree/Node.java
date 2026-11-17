package BinarySearchTree.tree;

public class Node {
	int key;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
		this.left=null;
		this.right=null;
	}
	
	public void show() {
		System.out.printf("Ref: %s, key: %d , Left: %s,  Right: %s\n",this.toString(),this.key,this.left,this.right);
	}
}
