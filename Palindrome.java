public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter string: ");
		String s = IO.readString();
		System.out.println(pal(s));
	}
	public static boolean pal(String s) {
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) != s.charAt((s.length()-1)-i)) {
				return false;
			}
		}
		return true;
	}

}
