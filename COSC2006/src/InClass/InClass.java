package InClass;

public class InClass {

	public static void main(String[] args) {
		System.out.println(fun(15));
		
	}
	
	// #1 - Analysis of recursion notes
	public static void fun(int n) {
		if(n==1)
			return;
		for(int i = 0; i<n; ++i)
			System.out.println("ABC");
		fun(n/2);
		fun(n/2);
	}
	
	// #2 T(n) = 2T(n/2) + O(n)
	public static void fun2(int n) {
		if(n==1)
			return;
		System.out.println("ABC");
		fun(n/2);
		fun(n/2);
		
	// #3 T(n) = T(n-1) + O(1)
	public static void fun3(int n) {
		if(n==1)
			return;
		System.out.println(n);
		fun(n-1);
	}
	}

}
