public class Strings {
	public static void main(String[] args) {
		String orig = IO.readString();
		String del = IO.readString();
		System.out.println(replace(orig,del));
	}

	public static String replace(String orig, String del) {
		String retval = "";
		
		int index = orig.indexOf(del);
		int prev = 0;
				
		while (index != -1) {
			retval = retval + orig.substring(prev,index);
			prev = index + del.length();
			index = orig.indexOf(del, prev);
		}
		retval = retval + orig.substring(prev);
		return retval;
	}
}


