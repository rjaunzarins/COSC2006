package Assignments;

public class Assignment1 {

	public static void main(String[] args) {
		
		int n = 20;
		int r = 3;
		//int count = fun(n);
		//System.out.println(count);
		int ans = fun(n);
		System.out.println(ans);
	}
	
	public static int fun(int n) {
	    int count = 0;
	    for (int i = n; i > 0; i /= 2) {
	    	
	        for (int j = 0; j < i; j++) {
	            count += 1;
	            System.out.println("j: " + j);
	        }
	        System.out.println("i: " + i);
	    }  
	    return count;
	}
	
	public static double foo(int n) {
		double sum;
		if (n == 0) { return 1.0; } 
		else {
		  sum = 0.0;
		  for (int i = 0; i < n; i++) {

			  sum += foo(i);
		  }
		  return sum;
		}
	}
	
	public static int foo2(int n, int r) {
		if (n > 0) {
			return (n % r + foo2(n / r, r));
		} else {
			return 0;
		}
	}
	
	public static int foo3(int n, int r) {
		if (n > 0) {
			return (n % r + foo3(n / r, r));
		} else {
			return 0;
		}
	}
	
	public static int fun(int x, int y) {
		if (x == 0) {
			return y;
		}
		return fun(x - 1, x + y);
	}
	
	public static int fun2(int n) {
		int x = 1;
		if (n == 1) {
			//System.out.println(x);
			return x;
		}
		for (int k = 1; k < n; k++) {
			System.out.println(x);
			x = x + fun2(k) * fun2(n - k);
			
		}
		//System.out.println(x);
		return x;
	}
}
//			  System.out.println("i: " + i);
//		System.out.println("n: " + n);