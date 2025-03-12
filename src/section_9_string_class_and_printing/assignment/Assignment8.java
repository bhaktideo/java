package section_9_string_class_and_printing.assignment;

public class Assignment8 {
    public static void main(String[] args) {

        // Convert string case

        String string = "upper case";
        String string1 = "LOWER Case";

        String convertString;
        convertString = string.toUpperCase();
        System.out.println("Converting the string to upper case: " + convertString);

        convertString = string1.toLowerCase();
        System.out.println("Converting the string to lower case: " + convertString);
    }
}
