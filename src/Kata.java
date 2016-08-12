/**
 * Created by jeffreydorney on 8/10/16.
 */
public class Kata {


    // method to add a space between every letter of the word given
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

    // method to add "not" to the front of the string, unless it is already there
    public String notString(String inputString) {

        // checks to see if it begins with "not" if so it'll return the string
        if(inputString.startsWith("not")) {
            return inputString;

        } else {

            // concatenates "not" to the front of the string and returns it
            inputString = "not " + inputString;
            return inputString;
        }
    }

    // method to remove a given character from a string at a defined location in the string
    public String missingChar(String inputString, int n) {

        // checks to see if the length is bigger than the number and runs if it is
        if(inputString.length() >= n) {

            // sets the front string to the first part of the word up to the given number
            String front = inputString.substring(0, n);

            // sets the back string to the remaining part the word until the end
            String back = inputString.substring(n + 1);

            // concatenates the new front and back without the numbered letter
            return front + back;
        } else {

            // returns the string with no changes if the number is longer than the word
            return inputString;
        }
    }

    
}
