import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
	public static void main(String[] argv) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.forEach(i -> System.out.println(i));
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		Stream<String> st = list.stream();
		st.forEach((s) -> System.out.println(s));
	}
}
