package Trees;

public class Node {
	
	protected int key;
	protected Node left;
	protected Node right;
	
	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	//Trees do not insert Nodes, they append onto the Tree

}
