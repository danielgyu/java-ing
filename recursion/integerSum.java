public class integerSum {

	public static int sumOfIntegers(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return num + sumOfIntegers(num - 1);
		}
	}

	public static void main(String argv[]) {
		int sum = sumOfIntegers(5);
		System.out.printf("sum: %d\n", sum);
	}
}
