package stringbufferstringbuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Welcome";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello");
		sb1.append("im that dude");
		System.out.println("String buffer : " + sb1);
		
		System.out.println(sb1.charAt(5));
		
		System.out.println(sb1.indexOf(str1));
		System.out.println(sb1.delete(4, 6));
		System.out.println(sb1.reverse());
		
	}

}
