package Arrays;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		
		//Create and print array
		int[] arr = new int[10];
		createArray(arr, keyb);
		printArray(arr);
		
		//Find min and max (pre-sort)
		int max = findMax(arr);
		int min = findMin(arr);
		
		//Sort and Print Array
		sortArray(arr);
		printArray(arr);
		
		//Find min and max (post-sort)
		max = findMaxSorted(arr);
		min = findMinSorted(arr);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
		//Find number of occurrences
		findOccurrences(arr);
	}
	
	
	//Create Array - O(n)
	public static void createArray(int[] arr, Scanner keyb) {
		System.out.println("Enter 10 integers: ");
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = keyb.nextInt();
		}
		//return arr;
	}
	
	
	//Print Array - O(n)
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	//Find max - O(n)
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	
	//Find min - O(n)
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	
	//Find max in sorted array - O(1)
	public static int findMaxSorted(int[] arr) {
		return arr[arr.length-1];
	}
	
	
	//Find min in sorted array - O(1)
	public static int findMinSorted(int[] arr) {
		return arr[0];
	}
	
	
	//Find occurrences - O(n^2) - Array must be sorted
	public static void findOccurrences(int[] arr) {
		System.out.println("Occurences: ");
		for(int i = 0; i < arr.length; ++i) {
			int count = 0;
			boolean dup = false;
			for(int j = 0; j < arr.length; ++j) {
				if(arr[i] == arr[j])								//Increment count for duplicate
						++count;
				if(i < arr.length-1) {								//Check for duplicates so each number is only printed once
					if(arr[i] == arr[i+1]) 							//Since array is sorted, check element ahead for equality
						dup = true;
				}
			}
			if(dup == false)
				System.out.println(arr[i] + " = " + count);
		}
	}
	
	
	//Sort Array - Selection Sort - O(n^2)
	public static void sortArray(int[] arr) {
		//Sort array
		int temp;
		for(int i = 0; i < arr.length-1; ++i) {
			for(int j = i+1; j < arr.length; ++j) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
