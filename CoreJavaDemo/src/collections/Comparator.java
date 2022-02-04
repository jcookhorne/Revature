package collections;

import java.util.Set;
import java.util.TreeSet;
import classes_and_objects.FordTruck;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FordTruck truck1 = new FordTruck(101, "silver", "Hatch back", "Ford F150");
		FordTruck truck3 = new FordTruck(102, "black", "Hatch back", "Ford F150");
		FordTruck truck2 = new FordTruck(103, "blue", "Hatch back", "Ford F150");
		
		Set<FordTruck> allCars = new TreeSet<FordTruck>(new CarComparisonLogic());
		
		allCars.add(truck3);
		allCars.add(truck2);
		allCars.add(truck1);
		System.out.println(allCars);
		

	}

}
