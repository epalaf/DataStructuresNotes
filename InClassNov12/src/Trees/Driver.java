package Trees;

public class Driver {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
/*		bst.insert(25);
		bst.insert(10);
		bst.insert(17);
		bst.insert(30);
		bst.insert(5);
		bst.insert(18); */
		
		//This will result in a Linked List
		//BinarySearchTrees require a degree of Restructuring to be most effective
/*		bst.insert(5);
		bst.insert(10);
		bst.insert(17);
		bst.insert(18);
		bst.insert(25);
		bst.insert(30); */
		
		bst.inOrderTraversal();
	}

}
