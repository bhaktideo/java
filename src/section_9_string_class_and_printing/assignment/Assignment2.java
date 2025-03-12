package section_9_string_class_and_printing.assignment;

public class Assignment2 {
    public static void main(String[] args) {

        // Concatenation of strings

        String data1 = "Learning ";
        String data2 = "JAVA";

        // Use + operator to concat string
        String data = data1 + data2;
        System.out.println("Using + operator concat string: " + data);

        // Use concat() method to concat string
        String sData = data1.concat(data2);
        System.out.println("Using concat() method to concat string: " + sData);
    }
}
