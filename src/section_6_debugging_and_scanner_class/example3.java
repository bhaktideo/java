package section_6_debugging_and_scanner_class;

import java.io.FileNotFoundException;
import java.lang.*;
import java.util.Scanner;
import java.io.File;

public class example3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Shailendra Dev\\javaCodes\\src\\section_6_debugging_and_scanner_class\\information.txt");
        Scanner Input = new Scanner(file);

        byte bnum;
        bnum = Input.nextByte();

        short snum;
        snum = Input.nextShort();

        int inum;
        inum = Input.nextInt();

        long lnum;
        lnum = Input.nextLong();

        String name;
        name = Input.next();

        Input.nextLine();

        String bookQuote;
        bookQuote = Input.nextLine();

        String quote;
        quote = Input.nextLine();

        System.out.println("Byte number: " + bnum);
        System.out.println("Short number: " + snum);
        System.out.println("Integer number: " + inum);
        System.out.println("Long number: " + lnum);
        System.out.println("Name: " + name);
        System.out.println("Book quote: " + bookQuote);
        System.out.println("Quote: " + quote);

    }
}
