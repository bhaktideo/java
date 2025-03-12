package section_9_string_class_and_printing.assignment;

public class Assignment6 {
    public static void main(String[] args) {

        // Check if string starts or ends with a specific sequence

        String anotherString = "JAVA programming";

        boolean checkStartsWith = anotherString.startsWith("JAV");
        System.out.println("Check if the string starts with 'JAV': " + checkStartsWith);

        checkStartsWith = anotherString.startsWith("Jav");
        System.out.println("Check if the string starts with 'Jav': " + checkStartsWith);

        boolean checkEndsWith = anotherString.endsWith("ming");
        System.out.println("Check if the string ends with 'ming': " + checkEndsWith);

    }
}
