public class FibonacciClass {
	private static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1);
		}
	}

	public static void main(String argv[]) {
		int input = 5;
		System.out.println(fibonacci(input));
	}
}
