package classes_and_objects;

public class FordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primitive type
		int grade;
		grade = 50;
		
		FordTruck  fordTruck; // no object was made here
		fordTruck = new FordTruck(); // object is created --- that is why we use the new keyword
		
		fordTruck.modelNo = 123456789;
		fordTruck.color = "Black";
		fordTruck.carType = "HatchBack";
		
		fordTruck.unlockCar();
		fordTruck.lockCar();
		fordTruck.accelerate();
		
	}

}
