package BinarySearchTree.tree;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree() {
		this.root=null;
	}
	
	//****** INSERT ***************************
	public void insert(int key) {
		this.root = insert(root,key);
	}

	private Node insert(Node current, int key) {
		if(current==null) {
			current = new Node(key);
			return current;
		}
		if(key<current.key) {
			current.left = insert(current.left,key);
		}else {
			if(key > current.key) {
				current.right = insert(current.right,key);	
			}
		}
		return current;
	}
	
	//****** SEARCH ***************************
	public boolean search(int key) { //Wrapper Function
		Node node = search(this.root,key);
		if (node == null) {
			return false;
		}
		return true;
	}
	
	private Node search(Node current, int key){ //Need to fix logic to work with all Tree nodes
		if(current.key==key) { //Base Case
			//current = new Node(key);
			return current;
		}
		if(key<current.key) {
			current.left = search(current.left,key);
		}else {
			if(key > current.key) {
				current.right = insert(current.right,key);	
			}
		}
		
		return null;
	}
	
	
	//****** DELETE ***************************
	public void delete(int key) { //Wrapper Function
		this.root = delete(this.root,key);
	}
	
	private Node delete(Node current, int key){
		return null;
	}
	
	
	//****** Find Minimum Key Value ***************************
	//Needs to be used in Delete Function
	public int findMin(Node node) {
		return 0;
	}
	
	//****** Height (Count in Nodes) ***************************
	public int height(Node root) {
    	return 0;
    }
    
    //****** Count Leaves ***************************
	public int countLeaves(Node root) {
		return 0;
	}
	
	//****** isValidBST ***************************
	public boolean isValidBST(Node root) {
		return false;
	}
	
	
	public void inOrderTraversal(Node root) {
		// Left-Root-Right
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.printf(" %d ", root.key);
			inOrderTraversal(root.right);
		}
	}
	
	public void preOrderTraversal(Node root) {
		// Root-Left-Right
		if(root!=null) {
			System.out.printf(" %d ", root.key);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(Node root) {
		// Left-Right-Root
		if(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.printf(" %d ", root.key);
		}
	}
	
	

}