package generics;

public class BoxDemo {
	public static void main(String[] args) {
		
		Box box1 = new Box(20,10,20);
		
		BoxGenerics<Float, Double> box2 = new BoxGenerics<Float, Double>(22.5f,15.4f,18.6f);
		BoxGenerics<Integer, Double> box3 = new BoxGenerics<Integer, Double>(22,15,18); 
		// can change types easier instead of changing data types
	}

}
