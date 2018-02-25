public class StringRec {
	public static void main (String[] args){
		String s = IO.readString();
		System.out.println(decompress(s));
	}
	public static String decompress(String compressedText) {
		String com = compressedText;
		
		if (com.length()==1) {
			return com;
		}if (com.charAt(0) == 48 && com.length() != 2) {
			return decompress(com.substring(2));
		}if (com.charAt(0) == 48 && com.length() == 2) {
			com = "";
			return com;
		}
		else if (com.charAt(0)>48 && com.charAt(0)<=57) { //if first char is digit
			char digit = com.charAt(0);
			char letter = com.charAt(1);
			digit--;
			return letter + decompress(Character.toString(digit) + com.substring(1));
		}
		return com.charAt(0)+decompress(com.substring(1));
	}
}

