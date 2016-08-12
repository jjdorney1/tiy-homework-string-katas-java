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

        System.out.println("\n");

        // output for the missing char kata including the string value that was given
        System.out.println("#3 - Missing Char Kata:\n**********************");
        System.out.println("missingChar(\"kitten\", 1) --> \"" + kata.missingChar("kitten", 1)+ "\"");
        System.out.println("missingChar(\"kitten\", 0) --> \"" + kata.missingChar("kitten", 0)+ "\"");
        System.out.println("missingChar(\"kitten\", 4) --> \"" + kata.missingChar("kitten", 4)+ "\"");

        System.out.println("\n");

        // output for the front back kata including the string value that was given
        System.out.println("#4 - Front Back Kata:\n**********************");
        System.out.println("frontBack(\"code\") --> \"" + kata.frontBack("code") + "\"");
        System.out.println("frontBack(\"a\") --> \"" + kata.frontBack("a") + "\"");
        System.out.println("frontBack(\"ab\") --> \"" + kata.frontBack("ab") + "\"");

        System.out.println("\n");

        // output for the front three kata including the string value that was given
        System.out.println("#5 - Front Three Kata:\n**********************");
        System.out.println("front3(\"Java\") --> \"" + kata.frontThree("Java") + "\"");
        System.out.println("front3(\"Chocolate\") --> \"" + kata.frontThree("Chocolate") + "\"");
        System.out.println("front3(\"abc\") --> \"" + kata.frontThree("abc") + "\"");
        System.out.println("front3(\"ab\") --> \"" + kata.frontThree("ab") + "\"");

        System.out.println("\n");

        // output for the back around kata including the string value that was given
        System.out.println("#6 - Back Around Kata:\n**********************");
        System.out.println("backAround(\"cat\") -> \"" + kata.backAround("cat") + "\"");
        System.out.println("backAround(\"Hello\") -> \"" + kata.backAround("Hello") + "\"");
        System.out.println("backAround(\"a\") -> \"" + kata.backAround("a") + "\"");

        System.out.println("\n");

        // output for the front 22 kata including the string value that was given
        System.out.println("#7 - Front 22 Kata:\n**********************");
        System.out.println("front22(\"kitten\") -> \"" + kata.front22("kitten") + "\"");
        System.out.println("front22(\"Ha\") -> \"" + kata.front22("Ha") + "\"");
        System.out.println("front22(\"abc\") -> \"" + kata.front22("abc") + "\"");

        System.out.println("\n");

        // output for the delete del kata including the string value that was given
        System.out.println("#8 - Delete Del Kata:\n**********************");
        System.out.println("delDel(\"adelbc\") -> \"" + kata.delDel("adelbc") + "\"");
        System.out.println("delDel(\"adelHello\") -> \"" + kata.delDel("adelHello") + "\"");
        System.out.println("delDel(\"adedbc\") -> \"" + kata.delDel("adedbc") + "\"");
        System.out.println("delDel(\"ab\") -> \"" + kata.delDel("ab") + "\"");
        System.out.println("delDel(\"del\") -> \"" + kata.delDel("del") + "\"");

        System.out.println("\n");

        // output for the start oz kata including the string value that was given
        System.out.println("#9 - Start Oz Kata:\n**********************");
        System.out.println("startOz(\"ozymandias\") -> \"" + kata.startOz("ozymandias") + "\"");
        System.out.println("startOz(\"bzoo\") -> \"" + kata.startOz("bzoo") + "\"");
        System.out.println("startOz(\"oxx\") -> \"" + kata.startOz("oxx") + "\"");
        System.out.println("startOz(\"oz\") -> \"" + kata.startOz("oz") + "\"");
        System.out.println("startOz(\"ounce\") -> \"" + kata.startOz("ounce") + "\"");
        System.out.println("startOz(\"o\") -> \"" + kata.startOz("o") + "\"");
        System.out.println("startOz(\"abc\") -> \"" + kata.startOz("abc") + "\"");
        System.out.println("startOz(\"\") -> \"" + kata.startOz("") + "\"");
        System.out.println("startOz(\"zoo\") -> \"" + kata.startOz("zoo") + "\"");
        System.out.println("startOz(\"aztec\") -> \"" + kata.startOz("aztec") + "\"");
        System.out.println("startOz(\"zzzz\") -> \"" + kata.startOz("zzzz") + "\"");
        System.out.println("startOz(\"oznic\") -> \"" + kata.startOz("oznic") + "\"");
        System.out.println("startOz(\"omnic\") -> \"" + kata.startOz("omnic") + "\"");

        System.out.println("\n");

        // output for the start oz kata including the string value that was given
        System.out.println("#10 - End Up Kata:\n**********************");
        System.out.println("endUp(\"Hello\") -> \"" + kata.endUp("Hello") + "\"");
        System.out.println("endUp(\"hi there\") -> \"" + kata.endUp("hi there") + "\"");
        System.out.println("endUp(\"hi\") -> \"" + kata.endUp("hi") + "\"");



    }
}
