package Trees;

public class BinarySearchTree {
	
	protected Node root;
	
	public BinarySearchTree() {
		this.root=null;
	}
	
	//Recursive insert method
	private Node insert(Node current, int key) {
		Node newNode;
		
		//Base Case
		if (current == null) {
			newNode = new Node(key);
			return newNode;
		}
		
		//Go Left(<), Go Right(>), or Ignore if in List already(==)
		//Primary Key must be a Unique Value
		
		if (key < current.key) {//Go Left
			current.left = insert(current.left, key);
		}
		if (key > current.key) {//Go Right
			current.right = insert(current.right, key);
		}
		return current;//Ignore
		
		//return null;
	}
	
	public void insert(int key) {
		this.root = insert(this.root, key);
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(this.root);
		System.out.printf("\n");
		
	}
	
	private void inOrderTraversal(Node node) {
		if (node != null) {//not at the end of List
			inOrderTraversal(node.left);
			System.out.printf(" %d ", node.key);
			inOrderTraversal(node.right);
		}
	}

}
