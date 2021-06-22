public class forLoop {
	public static void main(String[] argv) {
		int[] myArray = {1, 2, 3, 4, 5};

		for(int i = 0; i <= myArray.length; i++) {
			System.out.format("i is %d\n", i);
		}

		for(int num: myArray) {
			System.out.format("foreach num: %d\n", num);
		}
	}
}
