public class UsedCar extends Car {
	double mileage;
	public UsedCar(String _make, String _model, int _year, double _price, double _mileage) {
		super(_make, _model, _year, _price);
		mileage = _mileage;
	}
	@Override
	public String toString() {
		return super.toString() + spaces("Price: $".length()) + "Mileage: " + mileage + " (Used)";
	}
}