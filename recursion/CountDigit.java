public class CountDigit {

	public static int countDigitsIterative(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static int countDigitsRecursive(int num) {
		if (num == 0) {
			return 0;
		} else {
			return 1 + countDigitsRecursive(num / 10);
		}
	}

	public static void main(String argv[]) {
	
		int input = 1;
		int numDigits = countDigitsIterative(input);
		System.out.println("numDigitsIterative for 12345 is: " + numDigits);
		numDigits = countDigitsRecursive(input);
		System.out.println("numDigitsRecursive for 12345 is: " + numDigits);
	}
}
