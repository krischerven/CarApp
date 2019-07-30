public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	public Car() {
		super();
	}
	public Car(String _make, String _model, int _year, double _price) {
		super();
		make = _make;
		model = _model;
		year = _year;
		price = _price;
	}
	public static String spaces(int times) {
		String ret = "";
		for (int i = 0; i < times; ++i) {
			ret += " ";
		}
		return ret;
	}
	@Override
	public String toString() {
		return "Make: " + make + spaces("Make: ".length()) + "Model: " + 
			model + spaces("Model: ".length()) + "Year: " + year + 
			spaces("Year: ".length()) + "Price: $"+price;
	}
	// getters
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	// setters
	public void setMake(String _make) {
		make = _make;
	}
	public void setModel(String _model) {
		model = _model;
	}
	public void setYear(int _year) {
		year = _year;
	}
	public void setPrice(double _price) {
		price = _price;
	}
}