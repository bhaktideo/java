package section_9_string_class_and_printing.assignment;

public class Assignment9 {
    public static void main(String[] args) {

        // Replace characters in string

        String language = "English class";

        String replaceChar = language.replace('s','c');
        System.out.println("Replace character in string: " + replaceChar);

        replaceChar = language.replaceAll(" ","@");
        System.out.println("Replace regex: " + replaceChar);

    }
}
