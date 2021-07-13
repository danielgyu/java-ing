import java.util.TreeSet;

public class TreeSetExercise {
	
	public static void main(String args[]) {

		int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
		
		//Your code goes here
		TreeSet<Integer> tset = new TreeSet<>();

		for (int n : numbers) {
			tset.add(n);
		}

		System.out.println(tset.tailSet(50));
		System.out.println(tset.first());
		System.out.println(tset.last());
		}

}
