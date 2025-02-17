package classAnatomy;

import java.util.Arrays;

public class Examples {

    // it's possible to create the main function just by writing 'main'.
    public static void main(String[] args) {

        // you can also abbreviate 'System.out.println' by just writing 'sout'
        System.out.println("Hello world, i'm currently learning java language.");

        // the nomenclature 'final' it's used for declare an immutable variable.
        final double PI = 3.14;
        final String COUNTRY = "Brazil";

        // there no need to assign a value to a variable on the creation.
        String firstName = "Gustavo";
        String lastName;
        lastName = "Sousa";

        // for call a method, you have to create a variable with the same type of return and add the params if is required.
        String myName = completeName(firstName, lastName);
        System.out.println(myName);

    }

    // to create a method you must specify the return type before the name following the camelCase rule.
    public static String completeName(String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }

}
