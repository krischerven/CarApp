import java.util.*;

public class CarApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();
		System.out.println("How many cars?");
		int num = Math.min(Validator.getInt(sc), 5);
		for (int i = 0; i < num; ++i) {
			System.out.println("Enter the car make:");
			String make = Validator.getString(sc);
			System.out.println("Enter the car model:");
			String model = Validator.getString(sc);
			System.out.println("Enter the car year:");
			int year = Validator.getInt(sc);
			System.out.println("Enter the car price:");
			double price = Validator.getDouble(sc);
			cars.add(new Car(make, model, year, price));
			System.out.println("Car added: " + "{"+cars.get(cars.size()-1).toString()+"}");
		}
		System.out.println("\nCurrent inventory:");
		if (cars.size() > 0) {
			for (Car car : cars) {
				System.out.println(car);
			}
		}

		// I don't know cars.
		ArrayList<Car> selling = new ArrayList<>();
		selling.add(new Car("New Car #1", "Model #1", 2018, 10000));
		selling.add(new Car("New Car #2", "Model #2", 2016, 8000));
		selling.add(new Car("New Car #3", "Model #3", 2020, 10000));
		selling.add(new UsedCar("Used Car #1", "Model #1", 2015, 3000, 200000));
		selling.add(new UsedCar("Used Car #2", "Model #2", 2013, 4000, 120000));
		selling.add(new UsedCar("Used Car #3", "Model #3", 2014, 4400, 70000));

		System.out.println("Welcome to the Car Shop!");
		while (Validator.confirm(sc, "Would you like to buy a car? (y/n)", "Would you like to buy another car? (y/n)")) {
			System.out.println("Here's what's in stock:");
			for (int i = 0; i < selling.size(); ++i) {
				System.out.println((i+1) + ". " + selling.get(i));
			}
			int choice = Validator.getChoice(sc, 1, selling.size(), "Which car do you want to buy?");
			selling.remove(choice-1);
			if (selling.isEmpty()) {
				System.out.println("We're all out of cars! Come back later.");
				break;
			}
		}

		System.out.println("Goodbye.");
	}
}