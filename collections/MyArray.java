import java.util.Arrays;

public class MyArray {
	public static void main (String argv[]) {
		int[] nums = {1, 2, 3, 4};

		int index = Arrays.binarySearch(nums, 2);

		System.out.println(index);
	}
}
