public class ifStatements {
	public static void main(String[] argv) {
		int temperature = 50;

		if (temperature >= 20) {
			System.out.println("over 20");
		} else if (temperature >= 40) {
			System.out.println("shouldn't print");
		} else {
			System.out.println("also shouldn't print");
		}
	}
}
