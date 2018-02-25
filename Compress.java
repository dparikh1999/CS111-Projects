public class Compress {
	public static void main(String[] args) {
		String a = IO.readString();
		System.out.println(compress(a));
	}
	public static String compress(String original) {
		String compressed = "";
		String amount = "";
		String letter = "";
		int lettercount = 0;
		
		if (original.equals("")) {
			return compressed;
		}else {
			char previous = original.charAt(0);
			for (int i=0; i<original.length(); i++) {
				if (original.charAt(i)==previous) {
					lettercount++;
				}else {
					letter=original.substring(i-1,i);
					if (lettercount == 1) {
						compressed+=letter;
					}else {
						amount = String.valueOf(lettercount);
						compressed = compressed + amount + letter;
					}
					lettercount=1;
					previous = original.charAt(i);
				}
			}
			letter = original.substring(original.length()-1, original.length());
			if (lettercount == 1) {
				compressed+=letter;
			}else {
				amount = String.valueOf(lettercount);
				compressed = compressed + amount + letter; 
			}
		}
		return compressed;
	}
}
