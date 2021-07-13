import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class TreeSetPractice {
	public static void main(String argv[]) {
		List<Integer> list = new LinkedList<>();
		list.add(21);
		list.add(33);
		list.add(82);
		list.add(79);

		Set<Integer> set = new TreeSet<>(list);
		System.out.println(set);

		Set<Integer> rset = new TreeSet<>(Comparator.reverseOrder());
		rset.add(12);
		rset.add(72);
		rset.add(99);
		System.out.println(rset);
	}
}
