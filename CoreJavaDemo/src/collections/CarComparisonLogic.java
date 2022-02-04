package collections;

import java.util.Comparator;

import classes_and_objects.FordTruck;

public class CarComparisonLogic implements Comparator<FordTruck> {

	@Override
	public int compare(FordTruck o1, FordTruck o2) {
		// TODO Auto-generated method stub
		return o1.getModelNo() - o2.getModelNo();
	}
	
	

	
	
	
}
