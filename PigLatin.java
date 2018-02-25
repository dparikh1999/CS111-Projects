public class PigLatin {
	public static void main(String[] args) {
		String a = IO.readString();
		System.out.println(translate(a));
	}
	public static String translate(String original) {
		original = original.toLowerCase();
		String translated="";
		if (original.charAt(0) == 'a' 
			|| original.charAt(0) == 'e'
			|| original.charAt(0) == 'i'
			|| original.charAt(0) == 'o'
			|| original.charAt(0) == 'u') {
			translated = original+"vai";
		}else {
			String consonant = original.substring(0,1);
			String wordleft = original.substring(1, original.length());
			translated = wordleft + consonant + "ai";
		}
		return translated;
	}
}