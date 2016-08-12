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

    // method to take the first two letters and add them to the front and back
    public String front22(String inputString) {
        String lettersToAdd;

        // checks to see if its longer than 2 chars long
        if(inputString.length() >= 2) {

            // sets the lettersToAdd to the first two letters
            lettersToAdd = inputString.substring(0, 2);

            // returns the concatenation
            return lettersToAdd + inputString + lettersToAdd;
        } else {

            // returns the inputString concatenated with itself since it's less than two characters long
            return inputString + inputString + inputString;
        }
    }

    // method to remove the string del from another given string if it starts at index 1 (second letter)
    public String delDel(String str) {
        //String delRemovedEnd;
        //String firstLetter = str.charAt(0);

        // makes sure word is 4 or more chars and that the string del shows up at substring 1
        if( (str.length()>=4) && (str.substring(1, 4).equals("del")) ) {
            return str.substring(0, 1) + str.substring(4);
            //return str.charAt(0) + delRemovedEnd;

        } else {
            return str;
        }

    }

    // method to return the first two letters but only if the first letter is o and the second is z
    // returning only one if only one is present
    public String startOz(String inputString) {

        // sets variable lettersOfOz to null
        String lettersOfOz = "";

        // checks to see if the string is more than one char and if it is the letter o
        if( (inputString.length() >= 1) && (inputString.charAt(0) == 'o') ) {

            // concatenates lettersOfOz and the first char
            lettersOfOz = lettersOfOz + inputString.charAt(0);
        }

        // checks to see if the string is two or more chars long and if its the letter z
        if( (inputString.length() >= 2) && (inputString.charAt(1) == 'z') ) {

            // concatenates lettersOfOz and the second char
            lettersOfOz = lettersOfOz + inputString.charAt(1);
        }

        return lettersOfOz;
    }

    public String endUp(String inputString) {

        // checks to see if the string is 3 or less characters and if so uppercases all of them
        if (inputString.length() <= 3) {
            return inputString.toUpperCase();

        } else {

            // sets backLetters to the location of the last three letters in the string
            int backLetters = inputString.length() - 3;

            // sets the front and back of the string
            String stringFront = inputString.substring(0, backLetters);
            String stringBack  = inputString.substring(backLetters);

            // concatenates the front and the uppercase of the back of the string
            return stringFront + stringBack.toUpperCase();
        }
    }

}
