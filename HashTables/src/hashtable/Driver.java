package hashtable;
/*
 * Clusters of array values can lead to collisions
 */
public class Driver {

	public static void main(String[] args) {
		HashTable table = new HashTable(20);
		table.put("firstname", "Joe");
		table.put("email", "jsmith@gmail.com");
		table.put("phone", "479-652-0098");
		table.put("paper", "Joe Rocky Smith");
		table.put("address", "102 Main Streeet");
		table.put("school", "UAFS");
		
		table.show();

	}

}
