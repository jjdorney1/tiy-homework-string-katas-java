/**
 * Created by jeffreydorney on 8/10/16.
 */
public class Kata {

    public String explode(String inputWord) {

        int length = inputWord.length();

        String[] letters = new String[length];

        if( length < 2 ) {
            return inputWord;

        } else {
            return inputWord + inputWord;
        }
//        for (int wordLength; wordLength < (letters.length()); wordLength++) {
//            letters[wordLength] = inputWord.charAt(wordLength);
//            return letters[wordLength];
//        }

    }

    public String letters(String inputWord, int inputWordLength) {

    }
}
