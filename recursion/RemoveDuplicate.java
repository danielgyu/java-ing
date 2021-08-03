public class RemoveDuplicate {

    public static String removeDuplicate(String text) {
	if (text.length() == 1) {
	    return text;
	}
	
	if (text.substring(0, 1).equals(text.substring(1, 2))) {
	    return removeDuplicate(text.substring(1));
	} else {
	    return text.substring(0, 1) + removeDuplicate(text.substring(1));
	}
    }

    public static void main(String argv[]) {
	String input = "Thiss iiss a teesstt";
	System.out.println(removeDuplicate(input));

	// System.out.println(input.substring(1));
    }
}
