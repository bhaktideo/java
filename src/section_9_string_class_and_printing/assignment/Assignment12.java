package section_9_string_class_and_printing.assignment;

import java.util.Arrays;

public class Assignment12 {
    public static void main(String[] args) {

        // Split a string into array

        String name = "One Two Three Four Five";

        String[] split = name.split(" ");
        System.out.println("Split the string: " + Arrays.toString(split));

        String sData = "Learning$Java$At$S2P";
        String[] sDatas = sData.split("\\$");

        sData = "bhaktideo21@gmail.com";
        sDatas = sData.split("@.*[com]");


    }
}
