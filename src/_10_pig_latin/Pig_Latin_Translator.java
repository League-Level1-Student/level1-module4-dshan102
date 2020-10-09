package _10_pig_latin;

public class Pig_Latin_Translator {
	private static boolean isLetter(char c) {
		return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
		}
	private static String pigWord(String word) {
		int split = firstVowel(word);
		return word.substring(split)+"-"+word.substring(0, split)+"ay";
		}
	public String translate(String s) {
		String latin = "";
		int i = 0;
		while (i < s.length()) {
		// Take care of punctuation and spaces
		while (i < s.length() && !isLetter(s.charAt(i))) {
		latin = latin + s.charAt(i);
		i++;
		}
		}
		if (i>=s.length()) {
			break;
		}
		else {
			int begin = i;
			while (i < s.length() && isLetter(s.charAt(i))) {
			i++;
			}

		}

	}
}

