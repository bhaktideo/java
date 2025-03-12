package section_9_string_class_and_printing.assignment;

public class Assignment5 {
    public static void main(String[] args) {

        // Compare two strings

        String string1 = "assignment";
        String string2 = "ASSIGNMENT";
        String string3 = "assignment";
        String string4 = "project";

        boolean equals = string1.equals(string2);
        System.out.println("Equals() method between string1 and string2: " + equals);

        equals = string3.equals(string1);
        System.out.println("Equals() method between string3 and string1: " + equals);

        boolean equalsIgnoreCase = string2.equalsIgnoreCase(string3);
        System.out.println("EqualsIgnoreCase() method between string2 and string3: " + equalsIgnoreCase);

        int compare = string3.compareTo(string4);
        System.out.println("CompareTo() method between string3 and string4: " + compare);

        compare = string1.compareTo(string2);
        System.out.println("CompareTo() method between string1 and string2: " + compare);
    }
}
