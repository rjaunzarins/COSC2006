package Recursion;

public class Recursion {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int start = 1;
		int end = 5;
		int n = 5;
		int exponent = 10;
		String str = "ABCDEFG";
		System.out.println(n + "! = " + factorial(n));
		System.out.println("Sum of 1 to " + n + " = " + sum(n));
		System.out.println("The " + n + "th number in the fibonacci sequence is: " + fib(n));
		System.out.println("Forwards string: " + displayCharacters(str, 0));
		System.out.println("Backwards string: " + displayBackwards(str, str.length() - 1));
		System.out.println("Sum of array from " + start + " to " + end + " = " + rangeSum(arr, start, end));
		System.out.println(n + " to the power of " + exponent + " is: " + multiplication(n, exponent));
	}

	//Get n!
	public static int factorial(int n) {
		if( n == 0 )
			return 1;
		
		return n * factorial( n - 1 );
	}
	
	//Sum n natural numbers
	public static int sum(int n) {
		if( n == 0 )
			return 0;
		return n + sum( n - 1 );
	}
	
	//Get nth number in fibonacci sequence
	public static int fib(int n) {
		if( n == 0 ) return 1;
		if( n == 1 ) return 1;
		return fib( n - 1 ) + fib( n - 2);
	}
	
	//Print string forwards with recursion
	public static String displayCharacters(String str, int n) {
		if(n < str.length())
			return str.charAt(n) + displayCharacters(str, n + 1);
		return "";
	}
	
	//Print string backwards with recursion
	public static String displayBackwards(String str, int n) {
		if( n >= 0 )
			return str.charAt(n) + displayBackwards(str, n - 1);
		return "";
	}
	
	//Calculate sum of range in array
	public static int rangeSum(int[] arr, int start, int end) {
		if(start <= end)
			return arr[start] + rangeSum(arr, start + 1, end);
		return 0;
	}
	
	//Calculate exponential multiplication
	public static int multiplication(int n, int exponent) {
		if( exponent > 0 )
			return n * multiplication(n, exponent - 1);
		return 1;
	}
}