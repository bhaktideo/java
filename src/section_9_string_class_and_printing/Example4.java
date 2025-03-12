package section_9_string_class_and_printing;

import java.util.Arrays;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {

        String sName = "Mumbai Challengers";

        String lowerCaseData = sName.toLowerCase();
        System.out.println("Lower Case Data: " + lowerCaseData);

        String upperCaseData = sName.toUpperCase();
        System.out.println("Upper Case Data: " + upperCaseData);

        String sData1 = "Hello ";
        String sData2 = "World";

        String concatString = sData1.concat(sData2);
        System.out.println(concatString);

        char charData = sName.charAt(7);
        System.out.println("Character is at position: " + charData);

        String data = "Learning JAVA";
        String substring1 = data.substring(5);
        String substring2 = data.substring(4,12);

        System.out.println("Substring1: " + substring1);
        System.out.println("Substring2: " + substring2);

        byte[] nums = data.getBytes();
        System.out.println(Arrays.toString(nums));

    }
}
