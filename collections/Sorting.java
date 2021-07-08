import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String argv[]) {
		List<Integer> list = new ArrayList<>();
		list.add(91);
		list.add(81);
		list.add(71);
		list.add(51);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		List<String> strList = new ArrayList<>();
		strList.add("watermelon");
		strList.add("banana");
		strList.add("apple");
		System.out.println(strList);
		strList.stream().sorted().collect(Collectors.toList());
		System.out.println(strList);
	}
}
