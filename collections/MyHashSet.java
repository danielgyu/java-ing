import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

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

		Set<Integer> iset = new HashSet<>();
		iset.add(1);
		iset.add(2);
		iset.add(3);

		for (int i : iset) {
			System.out.println(i);
		}

		System.out.println("iterator----");
		Iterator<Integer> itr = iset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("forEach----");
		List<Integer> list = new ArrayList<>(iset);
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
