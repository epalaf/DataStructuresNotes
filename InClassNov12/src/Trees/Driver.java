package Trees;

public class Driver {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(25);
		bst.insert(10);
		bst.insert(17);
		bst.insert(30);
		bst.insert(5);
		bst.insert(18);
		
		bst.inOrderTraversal();
	}

}
