public class StringTest {
	public static void main(String [] args) {
		
		String s="hello";
		String y=IO.readString();
		
		System.out.println(y.length());
		
		if (s.equals(y)) {
			System.out.println("Same string!");
		}else {
			System.out.println("Different string!");
		}
	}

}
