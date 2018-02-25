public class StringLetters {
	public static void main(String[] args) {
		System.out.println("Enter string value: ");
		String s = IO.readString();
		int slength = s.length();
		
		for (int i=0; i<slength; i++) {
			System.out.println(s.charAt(i));
		}
	}
}


		
	


