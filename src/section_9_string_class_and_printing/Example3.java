package section_9_string_class_and_printing;

public class Example3 {
    public static void main(String[] args) {

        String word1 = "Hello, ";
        String string1 = "hey there!";
        String word2 = "hello";
        String string2 = "learning JAVA";

        String words = word1.concat(string1);

        int compareTo1 = word1.compareTo(word2);
        int compareTo2 = word2.compareTo(word1);
        int compareTo3 = string1.compareTo(string2);
        int compareTo4 = string2.compareTo(string1);

        int compareToIgnoreCase2 = word2.compareToIgnoreCase(word1);
        int compareToIgnoreCase1 = word1.compareToIgnoreCase(word2);
        int compareToIgnoreCase3 = string2.compareToIgnoreCase(string1);
        int compareToIgnoreCase4 = string1.compareToIgnoreCase(string2);
    }
}
