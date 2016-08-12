/**
 * Created by jeffreydorney on 8/10/16.
 */


public class Main {
    public static void main(String[] args) {

        Kata kata = new Kata();

        // output for the explode kata including the string value that was given
        System.out.println("Explode Kata:\n**********************");
        System.out.println("explode(\"example\") --> \"" + kata.explode("example") + "\"" );
        System.out.println("explode(\"cat\") --> \"" + kata.explode("cat") + "\"" );
        System.out.println("explode(\"\") --> \"" + kata.explode("") + "\"" );
        System.out.println("explode(\"c\") --> \"" + kata.explode("c") + "\"" );

        // line break
        System.out.println("\n");

        // output for the not string kata including the string value that was given
        System.out.println("Not String Kata:\n**********************");
        System.out.println("notString(\"candy\") --> \"" + kata.notString("candy") + "\"");
        System.out.println("notString(\"x\") --> \"" + kata.notString("x") + "\"");
        System.out.println("notString(\"not bad\") --> \"" + kata.notString("not bad") + "\"");

        // line break
        System.out.println("\n");

        // output for the missing char kata including the string value that was given
        System.out.println("Missing Char Kata:\n**********************");
        System.out.println("missingChar(\"kitten\", 1) --> \"" + kata.missingChar("kitten", 1)+ "\"");
        System.out.println("missingChar(\"kitten\", 0) --> \"" + kata.missingChar("kitten", 0)+ "\"");
        System.out.println("missingChar(\"kitten\", 4) --> \"" + kata.missingChar("kitten", 4)+ "\"");

    }
}
