/*
 * Create a class named Exam, with a method named mergeArrays().
 * This method will take two sorted integer arrays as arguments and 
 * merge them together in one sorted integer array. 
 * 
 * The method will return the new sorted array. 
 * Reminder the sorted array arguments can be different sizes.
 * 
 * Example One:

Array1: {1,2,3,5,7,9,11}

Array2: {2,4,6,8,12}

New Merged Array: {1,2,2,3,4,5,6,7,8,9,11,12}



Example Two:

Array1: {1,2,3}

Array2: {2,3,4,5,6,7}

New Merged Array: {1,2,2,3,3,4,5,6,7}
 */



public class Exam {
	public static void main(String[] args) {
		//System.out.println("Hello Worl");
		
		//int[] arr1 = {1,2,3,5,7,9,11};
		//int[] arr2 = {2,4,6,8,12};
		int[]arr1= {1,2,3};

		int[] arr2 = {2,3,4,5,6,7};
		int[] merged = mergeArrays(arr1, arr2);
		showMerge(merged);
		
		
	}
	
	public static int[] mergeArrays(int[] array1, int[] array2) {
		int mergeLength = array1.length + array2.length; 
		int[] merge = new int[mergeLength];
		int ind = 0;
		//int min =array1[0];
		//int max = array2[0];
		int store = 0;
		
		for (int j = 0; j < array1.length; j++) {
				merge[ind] = array1[j];
				ind++;
		}
			
		for (int k = 0; k < array2.length; k++) {
				merge[ind] = array2[k];
				ind++;
		}
		
		for (int i = 0; i < merge.length; i++) { //Bubble Sort
			for (int j = 0; j < mergeLength; j++) {
				if (merge[i] < merge[j]) {
					store = merge[i];
					merge[i] = merge[j];
					merge[j] = store;
				}
			}
		} 
		
		return merge;
	}
	
	public static void showMerge(int[] merge) {
		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i] + " ");
		}
	}
}
