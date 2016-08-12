/**
 * Created by jeffreydorney on 8/10/16.
 */


public class Main {
    public static void main(String[] args) {

        Kata kata = new Kata();

        System.out.println( "explode(\"example\") -> \"" + kata.explode("example") + "\"" );
        System.out.println( "explode(\"cat\") -> \"" + kata.explode("cat") + "\"" );
        System.out.println( "explode(\"\") -> \"" + kata.explode("") + "\"" );
        System.out.println( "explode(\"c\") -> \"" + kata.explode("c") + "\"" );
        
    }
}
