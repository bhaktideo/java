package section_9_string_class_and_printing.assignment;

import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {

        // Create Strings using different methods

        String sName = "Hello World";
        String sData = new String("JAVA Programming");

        System.out.println("Literal String: " + sName);
        System.out.println("String Data: " + sData);

        char[] arr = {'J', 'A', 'V', 'A'};
        String charData = Arrays.toString(arr);
        System.out.println("Character array to String: " + charData);
    }
}
