import java.util.function.Predicate;

public class PredicateDemo {
	static boolean isVehicleOldEnough(Vehicle person, Predicate<Vehicle> predicate) {
		return predicate.test(person);
	}

	public static void main (String argv[]) {
		Vehicle vehicle = new Vehicle("BMW", 20);
		Predicate<Vehicle> predicate = v -> v.age > 15;
		boolean eligible = isVehicleOldEnough(vehicle, predicate);

		System.out.println("eligibility: " + eligible);
	}
}

class Vehicle {
	String name;
	int age;

	Vehicle(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
