package src;

public class QuickSorts {
	public static void main(String[] args) {
		int[] test = {3, 1, 8, 7, 6, 2, 4, 9, 5};
		/*
		 * The Array will be reordered into a Static/Value Partition
		 */
	}
	
	/*
	 * Uses Static/Value Partitioning, aka a Pivot value that may or not be a midpoint
	 * will be used to split the array into two Partitions (less then or greater then 
	 * pivot)
	 * 
	 * Using recursion, we'll go through the less then partition first until completion
	 * then when the left partition is popped off, we'll recurse through the right
	 * partition
	 * 
	 * Rec(left);
	 * Rec(right);
	 * 
	 * Partitions:
	 * [left, pivot - 1] U [pivot + 1, right]
	 * 
	 * Indexes:
	 * Right Index- Initial Value is 0.
	 * Left Index- Initial Value is -1. 
	 * 
	 * Pivot: 
	 * Pivot- Initial Value is the element in the Last Index of the Array
	 */
	
	public static int Partition(int[] array, int start, int end) {
		int smallIndex = start;
		
		for(int i = start + 1; i <= end; i++) {
			if (array[i] < array[smallIndex]) {
				smallIndex = smallIndex + 1;
				int temp = smallIndex;
				array[smallIndex] = array[i];
				array[i] = temp;
			}
		}
		int temp = array[start];
		array[start] = array[smallIndex];
		array[smallIndex] = temp;
		
		return smallIndex;
	}
}
