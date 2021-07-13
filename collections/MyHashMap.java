import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
	public static void main(String argv[]) {
		Map<String, String> map = new HashMap<>();

		map.put("Python", "Guido");
		map.putIfAbsent("Java", "James");
		map.putIfAbsent("Go", "Google");
		map.putIfAbsent("Go", "Duplicate");

		System.out.println(map);

		System.out.println(map.get("Python"));
		System.out.println(map.getOrDefault("C++", "C#"));
		map.compute("Go", (k, v) -> v.toUpperCase());
		System.out.println(map);
	}
}
