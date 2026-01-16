package h2;

public class H2_main {
	private static int[] cache = new int[1000];

	public static void main(String[] args) {
		int n = 20;
		System.out.println("Rekursive Rechnung: " + fibonacci(n));
		System.out.println("Cache: " + fibonacciCached(n));
		System.out.println("For-Rechnung: " + fibonacciFor(n));
	
	}
	public static int fibonacci (int n) {			
		if (n<=0) {
				return 0;
		}
		if (n == 1 || n == 2) {
				return 1;
		}
			
		return fibonacci(n-1) + fibonacci(n-2);
			
			
		}
	
	public static int fibonacciCached(int n) {
		if (n<=1) {
			return n;
		}
		if (n==2) {
			return 1;
		}
		
		if (n<cache.length && cache[n] !=0) {
			return cache [n];
			
		}
		int result = fibonacciCached(n-1) + fibonacciCached(n-2);
		if ( n < cache.length) {
			cache[n] = result;
		}
		return result;
	}
	
	public static int fibonacciFor(int n) {
		if (n<=1) {
			return n;
		}
			int x = 0, y = 1;
			for (int i=2; i<=n;i++) {
				int now = x+y;
				x=y;
				y=now;
			}
			return y;
		
		
			}

	
	
}



