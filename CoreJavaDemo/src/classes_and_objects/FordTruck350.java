package classes_and_objects;

public class FordTruck350 extends FordTruck {
	// child class

	FordTruck350(String carName) {
		super(carName);// super refers to the immiediate super class FordTruck

		// TODO Auto-generated constructor stub
	}

	String popAirBags() {
		return " airbags are popped";
	}

	@Override
	String applyBrake() {
		// used to call the overridden method
		// of the parent class it has to be the first line
		return " ABS Break applied";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
