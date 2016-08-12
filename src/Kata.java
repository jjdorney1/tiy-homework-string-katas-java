/**
 * Created by jeffreydorney on 8/10/16.
 */
public class Kata {

    public String explode(String inputWord) {

        // sets length to the input word length
        int length = inputWord.length();

        // sets a new array for letters
        char[] letters = new char[length];

        // sets a place to add the new word with spaces
        String explodedWord = "";

        // checks to see if space needs to be added
        if( length < 2 ) {
            explodedWord = inputWord;
            return explodedWord;

        } else {
            // runs a for loop to set the array number to the certain letter then concatenates it
            for(int increment = 0; increment < length; increment++) {
                letters[increment] = inputWord.charAt(increment);
                explodedWord = explodedWord + letters[increment] + " ";
            }

            // returns the concatenated word and trims off extra space at the end
            return explodedWord.trim();
        }


        // remnant code left in for reasons:

//        for(int number; number < length; number++) {
//
//
//        }
//
//
//        (int wordLength; wordLength < (letters.length()); wordLength++) {
//            letters[wordLength] = inputWord.charAt(wordLength);
//            return letters[wordLength];
//        }

        //return "";
    //}

    //public char letters(String inputWord, int inputWordLength) {

    }
}
