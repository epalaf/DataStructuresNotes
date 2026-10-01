package inClassSep15;

import java.util.Random;

//Algorithmic Complexity: The way to compare the efficiency of Algorithms
/*
 * -How fast it runs
 * -How much memory it uses
 * 
 * Need to eliminate hardware differences
 * Need to find out how Algorithms scale
 * 
 * Big O: The worst case scenario for performance
 * Big Theta:
 * Big Omega:
 * 
 * Need to structure data differently to improve upon Big O scenarios
 * Big O Notation: 
 * O(n) - Linear Time
 * O(l) - Constant Time
 * O(logN) - Logarithmic Time
 * O(n^2) - Quadratic Time
 * 
 * 
 */
public class Prog {

	public static void main(String[] args) {
		int[] numbers = new int[200];//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//new int[10];
		int location;
		
		loadArrayRandom(numbers,200,1);
		showArray(numbers);
		bubbleSort(numbers);
		showArray(numbers);
		//showArray(numbers);
		
		location = linearSearch(numbers,201); 
		System.out.printf("The value is at %d\n", location);
		location = binarySearch(numbers, 201);
		System.out.printf("The value is at %d\n", location);
	}
	
	public static void loadArrayRandom(int[] theArray, int noRands, int start) {
		Random rand = new Random();
		int index;
		
		for(index=0;index<theArray.length;index++) {
			theArray[index] = rand.nextInt(noRands) + start;
		}
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		for(index=0;index<theArray.length;index++) {
			System.out.printf("[%d]: %d\n", index,theArray[index]);
		}
		
	}
	
	public static int linearSearch(int[] theArray, int value) { //Linear Time
		int location=-1;
		int index;
		
		for(index=0;index<theArray.length;index++) {
			if(theArray[index]==value) {
				location=index;
				break;
			}
		}
		return location;
	}
	
	public static void bubbleSort(int[] theArray) { //Quadratic Time
		int pass;
		int index;
		int temp;
		//The biggest number bubbles to the front
		
		for(pass=0;pass<theArray.length-1;pass++) {
			for(index=0;index<theArray.length-1;index++) {
				if(theArray[index]>theArray[index+1]) {
					temp=theArray[index];
					theArray[index]=theArray[index+1];
					theArray[index+1]=temp;
				}
			}
		}	
	}
	
	public static int binarySearch(int[] theArray,int value) { //Logarithmic Time
		int location=-1;
		
		int left = 0;
		int right = theArray.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (theArray[mid] == value) {
				location = mid; 
				break;
				}
				
			else if (theArray[mid] < value) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
			
			if (left == right && theArray[mid] != value) {
				break;
			}
		}
		
	/*	int pass;
		int index;
		int temp;
		int half = theArray.length / 2;
		
		if (theArray[half] <  value) {
				index = half + theArray.length / 2;
				if (theArray[index] > value) {
					temp = half + index / 2;
				}
			}
	*/
		return location;
	}

}
