public class whileStatement {
	public static void main(String[] argv) {
		int count = 10;
		while (count >= 5) {
			System.out.format("count is currently %d\n", count);
			--count;
		}
	}
}
