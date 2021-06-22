import java.util.Arrays;

public class myArray {
	public static void main(String[] argv) {

		int[] myNumbers = {1, 2, 3, 4, 5};
		System.out.println(myNumbers.length);

		String[] myStrings = {"hello", "world"};
		System.out.println(myStrings[0]);

		int[] moreNumbers = new int[3];
		moreNumbers[0] = 1;
		System.out.println(moreNumbers[0]);
		System.out.println(moreNumbers[1]);

		int[] arraysNums = {99 33, 44, 55};
		System.out.println(Arrays.toString(arraysNums));
		Arrays.sort(arraysNums);
		System.out.println(Arrays.toString(arraysNums));
	}
}
