package classes_and_objects;

public class FordTruck {

	// TODO Auto-generated method stub
	// declare a variable - instance variable
	private int modelNo;
	private String color;
	private String carType;
	private String carName;

	

	public FordTruck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FordTruck(int modelNo, String color, String carType, String carName) {
		super();
		this.modelNo = modelNo;
		this.color = color;
		this.carType = carType;
		this.carName = carName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	// getter for model number
	public int getModelNo() {
		return modelNo;
	}

	// setter for model number
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	String unlock() {
		// declare a variable - it is then a local variable (scope)
		return " unlocked";
	}

	String lock() {
		return " locked";
	}

	String accelerate() {
		return " Accelerates";
	}

	String applyBrake() {
		manualBrakeSystem();
		return " applied break";

	}

	String manualBrakeSystem() {
		return "User applied brake";
	}

	@Override
	public String toString() {
		return "FordTruck [modelNo=" + modelNo + ", color=" + color +" ]";
	}
	
	

}
