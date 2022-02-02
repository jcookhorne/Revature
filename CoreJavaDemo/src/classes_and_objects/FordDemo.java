package classes_and_objects;

public class FordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primitive type

		FordTruck fordTruck; // no object was made here
		fordTruck = new FordTruck("Ford 150"); // object is created --- that is why we use the new keyword

//		fordTruck.modelNo = 123456789;
//		fordTruck.color = "Black";
//		fordTruck.carType = "HatchBack";

		fordTruck.setModelNo(123456);
		fordTruck.setCarType("HatchBack");
		fordTruck.setColor("black");

		System.out.println(fordTruck.getCarName() + fordTruck.unlock());
		System.out.println(fordTruck.getCarName() + fordTruck.lock());
		System.out.println(fordTruck.getCarName() + fordTruck.accelerate());

		System.out.println("----------------------------------------------");

		FordTruck350 newTruck = new FordTruck350("Ford 350");
		System.out.println(newTruck.getCarName() + newTruck.unlock());
		System.out.println(newTruck.getCarName() + newTruck.lock());
		System.out.println(newTruck.getCarName() + newTruck.popAirBags());
		System.out.println(newTruck.getCarName() + newTruck.accelerate());

		FordTruck fordShift = new FordTruck350(null);
		FordTruck350 fordShift2 = (FordTruck350) fordShift;

		System.out.println(fordShift.unlock());
		System.out.println(fordShift.accelerate());

		// a parent class reference variable can point
		// to a child class object

		System.out.println(fordShift2.popAirBags());
	}

}
