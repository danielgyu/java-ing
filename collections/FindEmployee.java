import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindEmployee {

	public static void main(String[] argv) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alex", 23, "USA"));
		list.add(new Employee("Lee", 3, "USA"));
		list.add(new Employee("Kim", 50, "GER"));
		list.add(new Employee("Park", 50, "AUS"));
		list.add(new Employee("Jung", 50, "ZIM"));

		System.out.println(list);

		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next().country.equals("USA")) {
				itr.remove();
			}
		}

		System.out.println(list);

		System.out.println("sorting");

		for (Employee emp : list) {
			System.out.println(emp.country);
		}

		Collections.sort(list, (e1, e2) -> e1.country.compareTo(e2.country));

		for (Employee emp : list) {
			System.out.println(emp.country);
		}
	}
}
