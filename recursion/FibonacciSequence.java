public class FibonacciSequence {
    public static int fibonacci(int n) {
	if (n <= 1) {
	    return n;
	} else {
	    return (fibonacci(n-2) + fibonacci(n-1));
	}
    }

    public static void main(String argv[]) {
	int input = 8;

	System.out.println(fibonacci(input));
    }
}
