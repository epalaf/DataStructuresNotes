package src;

public class Recursion {
	
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
		result = sumUp(5);
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		
		if(n == 1) { //basecase
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	//write recur function to sum up all of the numbers
	
	public static int sumUp(int n) {
		
		if(n == 1) { //base case
			return 1;
		}
		return n + sumUp(n - 1);
	}

}
