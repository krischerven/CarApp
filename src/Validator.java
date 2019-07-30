import java.util.Scanner;

public class Validator {
	static boolean firstChoice = true;
	public static int getInt(Scanner sc) {
		while (true) {
			if (sc.hasNextInt()) {
				int ret = sc.nextInt();
				sc.nextLine(); // garbage line
				return ret;
			} else {
				System.out.println("Invalid integer!");
				sc.nextLine();
			}
		}
	}
	public static int getChoice(Scanner sc, int min, int max, String prompt) {
		while (true) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				int ret = sc.nextInt();
				sc.nextLine(); // garbage line
				if (ret >= min && ret <= max) {
					return ret;
				} else {
					System.out.println("Out-of-range.");
				}
			} else {
				System.out.println("Invalid integer!");
				sc.nextLine();
			}
		}
	}
	public static double getDouble(Scanner sc) {
		while (true) {
			if (sc.hasNextDouble()) {
				double ret = sc.nextDouble();
				sc.nextLine(); // garbage line
				return ret;
			} else {
				System.out.println("Invalid number!");
				sc.nextLine();
			}
		}
	}
	public static String getString(Scanner sc) {
		while (true) {
			if (sc.hasNextLine()) {
				return sc.nextLine();
			}
		}
	}
	public static boolean confirm(Scanner sc, String prompt1, String prompt2) {
		while (true) {
			if (firstChoice) {
				firstChoice = false;
				System.out.println(prompt1);
			} else {
				System.out.println(prompt2);
			}
			String line = sc.nextLine().toLowerCase().trim();
			if (line.equals("y") || line.equals("yes")) {
				return true;
			} else if (line.equals("n") || line.equals("no")) {
				return false;
			} else {
				System.out.println("Please input y/n or yes/no.");
			}
		}
	}
}