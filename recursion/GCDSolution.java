public class GCDSolution {
    public static int gcd(int x, int y) {
	if (x == y) {
	    return x;
	}

	if (x > y) {
	    return gcd(x - y, y);
	} else {
	    return gcd(y - x, x);
	}
    }

    public static void main(String argv[]) {
	System.out.println(gcd(56, 42));
    }
}
