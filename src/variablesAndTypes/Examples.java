package variablesAndTypes;

public class Examples {

    public static void main(String[] args) {

        // you can assign the value of a smaller variable like short to a larger variable like int, but not vice versa.
        final short shortNumber = 1;
        int largerVariable = shortNumber;
        // but by using casting you can ensure that the number is always smaller, so you can do the opposite.
        short shortVariable = (short) largerVariable;

    }
}
