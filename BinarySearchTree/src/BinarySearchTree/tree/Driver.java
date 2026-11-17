package BinarySearchTree.tree;

public class Driver {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(12);
		tree.insert(8);
		tree.insert(2);
		tree.insert(17);
		
		System.out.printf("Results: %s\n", tree.search(10));
		
		tree.inOrderTraversal(tree.root);
		System.out.println();
		tree.preOrderTraversal(tree.root);
		System.out.println();
		tree.postOrderTraversal(tree.root);
		System.out.println();
		
	}

}
