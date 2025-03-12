package section_9_string_class_and_printing.assignment;

public class Assignment11 {
    public static void main(String[] args) {

        // Find the position of character or substring

        String string = "All the assignments are done";

        int index = string.indexOf('a');
        System.out.println("Index of 'a': " + index);

        index = string.lastIndexOf("done");
        System.out.println("Index of 'done': " + index);
    }
}
