import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Iterator;

public class COWAL {
	public static void main(String[] argv) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(1, 100);

		Iterator<Integer> itr = list.iterator();
		
		list.add(999);

		System.out.println("START");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("AGAIN");
		itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
