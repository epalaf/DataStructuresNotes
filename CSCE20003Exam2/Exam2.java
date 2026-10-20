
public class Exam2 {
	/*
	 * Just needs to have a true/false field on whether swaps are still
	 * being done, and if not, break loop
	 */

	public static void main(String[] args) {
		int[] array= {100,90,80,70,60,50,40,30,20,10};
		int[] array1= {10,20,30,100,50,90,70,80,60,40};
		int[] array2= {10,20,30,40,50,60,70,80,90,100};
		int comparisons;
		
/*		showArray(array);
		comparisons=bubbleSort(array);
		showArray(array);
		System.out.printf("Comparisons: %d\n",comparisons);
		
		System.out.printf("----------------\n\n");
		
		showArray(array1);
		comparisons=bubbleSort(array1);
		showArray(array1);
		System.out.printf("Comparisons: %d\n",comparisons);
		
		System.out.printf("----------------\n\n");
		
		showArray(array2);
		comparisons=bubbleSort(array2);
		showArray(array2);
		System.out.printf("Comparisons: %d\n",comparisons);
		
		System.out.printf("----------------\n\n"); */
		
		showArray(array);
		comparisons=AdaptbubbleSort(array);
		showArray(array);
		System.out.printf("Comparisons: %d\n",comparisons);
		
		System.out.printf("----------------\n\n");
		
		showArray(array1);
		comparisons=AdaptbubbleSort(array1);
		showArray(array1);
		System.out.printf("Comparisons: %d\n",comparisons);
		
		System.out.printf("----------------\n\n");
		
		showArray(array2);
		comparisons=AdaptbubbleSort(array2);
		showArray(array2);
		System.out.printf("Comparisons: %d\n",comparisons);
		
	}
	
	public static void showArray(int[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%d", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static int bubbleSort(int[] array) {
		int index,pass, temp;
		int comparisons=0;
		
		for(pass=0;pass<array.length;pass++) {
			for(index=0;index<array.length-1;index++) {
				comparisons++;
				if(array[index]>array[index+1]) {
					temp=array[index];
					array[index]=array[index+1];
					array[index+1]=temp;
				}
			}
		}
		return comparisons;
	}
	
	public static int AdaptbubbleSort(int[] array) {
		int index,pass, temp;
		int comparisons=0;
		int min = array[0];
		int max = array[array.length - 1];
		int checkMin = 0;
		
		for(pass=0;pass<array.length;pass++) {
			for(index=0;index<array.length-1;index++) {
				comparisons++;
				if(array[index]>array[index+1]) {
					temp=array[index];
					array[index]=array[index+1];
					array[index+1]=temp;
				}
				
				if (array[index] < min){
					//temp = min;
					min = array[index];
					//array[index] = temp;
				}
				if (array[index] > max) {
					//array[array.length - 1] = array[index];
					//int num = max;
					max = array[index];
					//array[index] = max;
					
					
				}
				
				if (array[index] >= min && array[0] == min && array[array.length - 1] == max) {
					checkMin++;
				}
				
				if (checkMin == array.length - 1) {
					break;
				}
			}
			if (checkMin == array.length - 1) {
				break;
				}
			else {
				checkMin = 0;
			}
			
		}
		return comparisons;
	}

}
