public class ReverseString {

    public static String reverse(String myString) {
	if (myString.isEmpty()) {
	    return myString;
	} else {
	    System.out.println(myString);
	    // remember that you can add(+) two Strings
	    return reverse(myString.substring(1)) + myString.charAt(0);
	}
    }

    public static void main(String argv[]) {
	String myStr = "Hello";
	System.out.println(reverse(myStr));
    }
}
