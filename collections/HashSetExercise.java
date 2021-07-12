import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExercise {
	public static void main(String args[]) {
		int[] data = {12, 34, 1, 56, 43, 34, 65};
		int duplicate = 0;

		// Your logic will go here
		Set<Integer> set = new HashSet<>();
		for (int d : data) {
			if (set.contains(d)) {
				duplicate = d;
			}
			else {
				set.add(d);
			}
		}

		System.out.println(duplicate);
	}
}
