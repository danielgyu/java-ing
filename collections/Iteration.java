import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Iteration {
	public static void main(String argv[]) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		Iterator<Integer> newItr = list.iterator();
		newItr.forEachRemaining(el -> el + 100);
	}
}
