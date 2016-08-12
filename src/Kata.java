/**
 * Created by jeffreydorney on 8/10/16.
 */
public class Kata {


    // method to add a space between every letter of the string given
    public String explode(String inputString) {

        // sets length to the input string length
        int length = inputString.length();

        // sets a new array to hold the chars in the string
        char[] chars = new char[length];

        // sets a place to add the new string with spaces
        String explodedWord = "";

        // checks to see if space needs to be added
        if( length < 2 ) {
            explodedWord = inputString;
            return explodedWord;

        } else {
            // runs a for loop to set the array number to the certain letter then concatenates it
            for(int charNumber = 0; charNumber < length; charNumber++) {

                // sets the value of the array for letter to the value of the char at the increment
                chars[charNumber] = inputString.charAt(charNumber);

                // concatenates the explodedWord so far, the char in the array and a space
                explodedWord = explodedWord + chars[charNumber] + " ";
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

    // method to take the first and last characters and swap them for a word
    public String frontBack(String inputString) {

        // checks to see if the string is at least 2 chars long
        if(inputString.length() <= 1) {
            return inputString;

        } else {

            // sets the center of the string to middle
            String middle = inputString.substring(1, inputString.length()-1);

            // returns the last character + middle + the first character
            return inputString.charAt(inputString.length()-1) + middle + inputString.charAt(0);
        }
    }

    // method to take the first three chars (or less) and repeat them 3 times

    public String frontThree(String inputString) {
        String firstThree;

        // checks to see how long the word is - will only take first three letters
        if( inputString.length() >= 3) {
            firstThree = inputString.substring(0, 3);

        } else {

            // assigns the letters that are there if less than three
            firstThree = inputString;
        }

        // returns the concatenated string
        return firstThree + firstThree + firstThree;

    }

    // method to take the last char and put it at the beginning and end of the word
    public String backAround(String inputString) {

        // declares lastletter variable
        String lastLetter;

        // sets lastletter variable to the last letter of the given string
        lastLetter = inputString.substring( inputString.length()-1 );
        return lastLetter + inputString + lastLetter;

    }
}
