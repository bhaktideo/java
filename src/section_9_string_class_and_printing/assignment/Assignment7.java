package section_9_string_class_and_printing.assignment;

public class Assignment7 {
    public static void main(String[] args){

        // Extract a substring

        String anotherString = "Learning Java Programming";

        String subString = anotherString.substring(19);
        System.out.println("Substring of the string from index 19: " + subString);

        subString = anotherString.substring(7,15);
        System.out.println("Substring of the string from index 7 to index 14: " + subString);

        subString = anotherString.substring(9,25);
        System.out.println("Substring of the string from index 9 to index 24: " + subString);
    }
}
