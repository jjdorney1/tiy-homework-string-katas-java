/**
 * Created by jeffreydorney on 8/10/16.
 */


public class Main {
    public static void main(String[] args) {

        Kata kata = new Kata();

        // output for the explode kata including the string value that was given
        System.out.println("#1 - Explode Kata:\n**********************");
        System.out.println("explode(\"example\") --> \"" + kata.explode("example") + "\"" );
        System.out.println("explode(\"cat\") --> \"" + kata.explode("cat") + "\"" );
        System.out.println("explode(\"\") --> \"" + kata.explode("") + "\"" );
        System.out.println("explode(\"c\") --> \"" + kata.explode("c") + "\"" );

        // line break
        System.out.println("\n");

        // output for the not string kata including the string value that was given
        System.out.println("#2 - Not String Kata:\n**********************");
        System.out.println("notString(\"candy\") --> \"" + kata.notString("candy") + "\"");
        System.out.println("notString(\"x\") --> \"" + kata.notString("x") + "\"");
        System.out.println("notString(\"not bad\") --> \"" + kata.notString("not bad") + "\"");

        // line break
        System.out.println("\n");

        // output for the missing char kata including the string value that was given
        System.out.println("#3 - Missing Char Kata:\n**********************");
        System.out.println("missingChar(\"kitten\", 1) --> \"" + kata.missingChar("kitten", 1)+ "\"");
        System.out.println("missingChar(\"kitten\", 0) --> \"" + kata.missingChar("kitten", 0)+ "\"");
        System.out.println("missingChar(\"kitten\", 4) --> \"" + kata.missingChar("kitten", 4)+ "\"");

        // line break
        System.out.println("\n");

        // output for the front back kata including the string value that was given
        System.out.println("#4 - Front Back Kata:\n**********************");
        System.out.println("frontBack(\"code\") --> \"" + kata.frontBack("code") + "\"");
        System.out.println("frontBack(\"a\") --> \"" + kata.frontBack("a") + "\"");
        System.out.println("frontBack(\"ab\") --> \"" + kata.frontBack("ab") + "\"");

        // line break
        System.out.println("\n");

        // output for the front three kata including the string value that was given
        System.out.println("#5 - Front Three Kata:\n**********************");
        System.out.println("front3(\"Java\") --> \"" + kata.frontThree("Java") + "\"");
        System.out.println("front3(\"Chocolate\") --> \"" + kata.frontThree("Chocolate") + "\"");
        System.out.println("front3(\"abc\") --> \"" + kata.frontThree("abc") + "\"");
        System.out.println("front3(\"ab\") --> \"" + kata.frontThree("ab") + "\"");

        // line break
        System.out.println("\n");

        // output for the back around kata including the string value that was given
        System.out.println("#6 - Back Around Kata:\n**********************");
        System.out.println("backAround(\"cat\") -> \"" + kata.backAround("cat") + "\"");
        System.out.println("backAround(\"Hello\") -> \"" + kata.backAround("Hello") + "\"");
        System.out.println("backAround(\"a\") -> \"" + kata.backAround("a") + "\"");

        




    }
}
