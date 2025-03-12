package section_9_string_class_and_printing.assignment;

public class Assignment4 {
    public static void main(String[] args) {

        // Access individual characters

        String sData = "Using the charAt() method";

        int index = sData.charAt(7);
        int index1 = sData.charAt(14);

        System.out.println("Character at position 7: " + index);
        System.out.println("Character at position 14: " + index1);
    }
}
