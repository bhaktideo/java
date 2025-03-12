package section_9_string_class_and_printing.assignment;

public class Assignment13 {
    public static void main(String[] args) {

        String string = "cabbcaba";

        boolean result ;
        result = string.matches(".*");
        result = string.matches("[abc]*");
        result = string.matches("[abc][de].*");
        result = string.matches("[^abc]");
        result = string.matches("ca");
    }
}
