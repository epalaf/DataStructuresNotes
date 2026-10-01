package exceptions;

//Exception is the top level class when it comes to handling Exceptions
//Checked Exception forces the user to handle the Exception (i.e Try/Catch or Throw)
//Unchecked Exception are not handled, they don't require handling(i.e Dividing by 0)
//IOException is an example of a Checked Exception
//RuntimeException is an example of a Unchecked Exception

public class CustomException extends RuntimeException {
	public CustomException(String message) {
		super(message);
	}
	
	public static int fun1(int start, int end) {
		int result=-1;
		try { //Does not require Try/Catch, but can be used to check Exceptions
		if (end > start) {
			result = end - start;
		}
		
		else {
			throw new CustomException("End is Larger then Start");
		}
		}
		catch(CustomException e) {
			System.out.printf("Custom, Exception Generated\n");
		}
		return result;
	}
	
	public static void main(String[] args) {
		int result = fun1(20, 19);
		System.out.printf("%d", result);
	}

}
