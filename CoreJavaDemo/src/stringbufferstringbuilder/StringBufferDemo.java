package stringbufferstringbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating objects with each one
		String str1 = "";
		str1 = str1 + "welcome! ";
		str1 = str1 + "that guy";
		// works the same almost just with it not taking up more memory in the heap
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello ");
		sb1.append("im that dude");
		System.out.println("String buffer : " + sb1);
		
		// string to primitive
		String data1 = "45.67";
		double data2 = Double.parseDouble(data1);
		System.out.println(data2);
		// string to primitive
		String data3 = "80";
		int data4 = Integer.parseInt(data3);
		System.out.println(data4);
		
		//primitive to string
		int data5 = 89;
		String data6 = data5 + "";
		
		//10 string builder methods
		
		// 5 string buffer methods
		// delete will remove substring(char) in between the parameters set of where you want it to remove
		sb1.delete(0, 4);
		System.out.println(sb1);
		
		//sb1.capacity();
		System.out.println(sb1.capacity());
		
		//sb1.length();
		System.out.println(sb1.length());
		
		System.out.println(sb1.reverse());
		
	}

}
