package Assignments;

public class AysmtoticAnalysis {

	public static void main(String[] args) {
		
		int n = 10;
//		for (int i = 1; i < n * n * n; i *= 2) {
//			System.out.println(i);
//		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println("i: " + i);
			for (int j = 1; j <= n; j += i) {
				System.out.println("Outer j: " + j);
				for (int k = 1; k <= i; k++) {
					System.out.println("Inner j: " + j);
				}	
			}
		}
	}
}
