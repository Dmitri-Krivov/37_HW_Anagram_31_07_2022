package telran.words.model;

public class Anagram {
	public static boolean isAnagram(String word, String part) {
		if (part == null || part.isEmpty() || part.length() > word.length())
			return false;
		String[] lettersInWord = word.toLowerCase().split("");
		String[] lettersInPart = part.toLowerCase().split("");
		int size = 0;
		for (int i = 0; i < lettersInPart.length; i++) {
			for (int j = 0; j < lettersInWord.length; j++) {

				if (lettersInPart[i].equals(lettersInWord[j])) {
					size++;
					lettersInWord[j] = null;
					break;
				}
			}
		}
		if (size == lettersInPart.length) {
			return true;
		}
		return false;

	}

}
