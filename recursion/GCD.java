public class GCD {

    public static int divisor(int x, int y, int z) {
	if ((x % z == 0) && (y % z == 0)) {
	    return z;
	} else {
	    return divisor(x, y, z - 1);
	}
    } 

    public static int gcd(int x, int y) {
	if (x < y) {
	    return divisor(x, y, x - 1);
	} else {
	    return divisor(y, x, y - 1);
	}
    }

    public static void main (String argv[]) {
	int x = 36;
	int y = 54;

	System.out.println(gcd(x, y));
    }
}
