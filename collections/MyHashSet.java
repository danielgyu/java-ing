import java.util.Set;
import java.util.HashSet;

public class MyHashSet {
	public static void main(String argv[]) {
		Set<String> set = new HashSet<>();

		set.add("Banana");
		set.add("Apple");
		set.add("Banana");

		System.out.println(set);

		System.out.println(set.contains("Apple"));

		set.remove("Empty");
		System.out.println(set);

		set.clear();
		System.out.println(set);

	}
}
