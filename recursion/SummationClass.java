public class SummationClass {

	public static int sumAll(int num) {
		if (num == 1) {
			return num;
		} else {
			return num + sumAll(num - 1);
		}
	}

	public static void main(String[] argv) {
		int input = 3;
		int sum = sumAll(input);
		System.out.println("sum: " + sum);
	}
}
