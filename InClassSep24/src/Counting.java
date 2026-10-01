
public class Counting {
	public static void main(String[] args) {
		//count(0);
		int[] test = {6, 5, 4, 3, 2, 1};
		selectionSort(test);
	}
	
	public static void count(int num) {
		//int diff = num;
		
		if (num == 10) {
			return;
		}
		//count(num+1);
		System.out.println(num);
		count(num+1);

		
	}
	
	public static void selectionSort(int[] a) {
		//int min = a[0];
		//int count = 0;
		int index = 0;
		
		//go through array, and swap positions of the minimum value with the starting 
		//index
		for (int j = 0; j < a.length - 1; j++) {
			int min = a[j];
			for (int i = j + 1; i < a.length; i++) {
				if (a[i] < a[j]) {
					min = a[i];
					index = i;
				}
				int temp = a[j];
				a[j] = min;
				a[index] = temp;
			//a[count] = min;
			}

			//a[index] = a[count];
			//a[count] = min;
			//count++;
		
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void insertionSort(int[] a) {
		
	}
	
	

}
