package interfacesandabstractclasses;

public class Animals {
	
	
	// if the class has at least one abstract method the class in turn becomes abstract
	// we cannot create an object of abstract class
	// abstract classes are incomplete classes
	// abstract classes are meant to be inherited
	void breathe() {
		System.out.println("Animal breathes");
		
	}
	void mobility() {};// abstract Method
	//abstract methods dont havea  body
	// abstract methods are declared not initialized
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
