import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String argv[]) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(4);
		System.out.println(list);

		list.add(2, 3);
		System.out.println(list);

		List anotherList = new ArrayList();
		anotherList.add(50);
		anotherList.add(60);
		anotherList.add(70);

		list.addAll(1, anotherList);
		System.out.println(list);

		System.out.println("index 2: " + list.get(1));
		System.out.println("size: " + list.size());

		List<String> strList = new ArrayList<>();
		strList.add("apple");
		strList.add("banana");

		strList.replaceAll((element) -> element.toUpperCase());
		System.out.println(strList);
		
		for (String st : strList) {
			System.out.println("for loop: " + st);
		}
	}
}
