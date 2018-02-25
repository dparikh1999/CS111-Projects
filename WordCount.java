public class WordCount {
	public static void main(String[] args) {
		String phrase = IO.readString();
		int maxLength = IO.readInt();
		System.out.println(countWords(phrase, maxLength));
	}
	
	public static int countWords(String original, int maxLength) {
		String word;
		int count = 0;
		int wordcount = 0; 
		
		if (original.equals(" ")) {
			return wordcount;
		}else {
			String[] words = original.split("\\s+");
			
			for (int i=0; i<words.length; i++) {
				word = words[i];
				int length = words[i].length();
				
				for (int j=0; j<length; j++) {
					if ((word.charAt(j)>=65 && word.charAt(j)<=90)
						|| (word.charAt(j)>=97 && word.charAt(j)<=122)) {
						count++;
					}else {
						break;
					}
				}
				if (count<=maxLength && count>0) {
					wordcount++;
				}
				count = 0;
			}
		}
		return wordcount;
	}
}
