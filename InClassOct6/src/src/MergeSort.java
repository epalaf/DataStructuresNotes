package src;

public class MergeSort {
	public static void main(String[] args) {
		int[] test = {11, 43, 87, 27, 54, 8, 32, 71, 44, 12};
		showArray(test);
	}
	
	public static void showArray(int[] array) {
		
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.print("]");
		
	}

	
	public static void mergeSort(int[] arr, int start, int end) {
		
	}

}
