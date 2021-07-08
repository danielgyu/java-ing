import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String argv[]) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Lee", 40));
		list.add(new Employee("Kim", 10));

		System.out.println(list);
		Collections.sort(list);

		for (Employee emp : list) {
			System.out.println(emp.name);
		}
	}
}
