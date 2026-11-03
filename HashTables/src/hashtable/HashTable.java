package hashtable;

/*
 * The More Filled an Array is, the more likely collisions will occur
 * Collisions will lead to the worst case run time, so we have to adjust
 * the array during runtime
 */

/*
 * Load Factor = size * capacity
 * Load Factor will determine whether adjustments need to be made
 * 
 * 
 */
public class HashTable {
	
	
	Node[] table;
	int capacity;
	int size;
	
	public HashTable(int capacity) {
		table = new Node[capacity];
		this.capacity = capacity;
		this.size = 0;
		
	}
	

}
