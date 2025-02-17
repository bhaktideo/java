package section_9_string_class_and_printing;

public class Example2 {
    public static void main(String[] args) {

        byte[] bNums = {66,67,70,71,98};
        String sLetters = new String(bNums);

        char[] chars = {'B','V','S','T'};
        String sChars = new String(chars);

        char[] cNums = {'[','*','&','$','@'};
        String symbols = new String(cNums, 1, 3);

    }
}
