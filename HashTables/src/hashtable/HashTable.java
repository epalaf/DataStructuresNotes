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
 * If you need to maintain the order of an array, you will not use a Hash Table
 * because they rearrange the array
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
	
	public int hashkey(String key) {
		
		//Always need to modulus the hash with array's size to make sure the index is
		//within the range of the backing array
		int index;
		int total = 0;
		
		for (index = 0; index < key.length(); index++) {
			total = total + (int) key.charAt(index) * 13;
		}
		int indexCalc = total % this.capacity;
		
		return indexCalc;
	}
	
	public void put(String key, String value) {
		int hashkey = hashkey(key);
		Node node = new Node(key, value);
		this.table[hashkey] = node;
		this.size++;
		
		
	}
	
	public String get(String key) {
		String str = null;
		int hashkey = hashkey(key);
		if (this.table[hashkey] != null) {
			str = this.table[hashkey].value;
		}
		return str;
	}
	
	public void show() {
		int index; 
		
		//Load Factor determines whether we need to make a bigger array
		
		System.out.printf("Load Factor: %3.2f\n", (float)this.size / this.capacity);
		System.out.printf("-------------\n");
		for (index = 0; index < this.capacity; index++) {
			if (this.table[index] != null) {
				System.out.printf("[%d]: Key: %s Value: %s \n", index, this.table[index].key,
					this.table[index].value);
			}
			else {
				System.out.printf("[%d]: NULL \n", index);
			}
		}
	}
	

}
