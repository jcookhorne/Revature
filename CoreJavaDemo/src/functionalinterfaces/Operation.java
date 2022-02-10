package functionalinterfaces;

@FunctionalInterface
public interface Operation {
	// methods by default in an interfaces are public and abstract 
	public int operate(int num1, int  num2);
}
