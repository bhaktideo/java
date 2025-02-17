package section_7_data_types_and_variables;

import java.lang.*;
import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        byte lbnum;
        short lsnum;
        int linum;
        long llnum;

        float lfnum;
        double ldnum;

        String sname;
        char cdata;

        boolean bdata;

        System.out.println("Enter a byte number: ");
        lbnum = Input.nextByte();

        System.out.println("Enter a short number: ");
        lsnum = Input.nextShort();

        System.out.println("Enter a int number: ");
        linum = Input.nextInt();

        System.out.println("Enter a long number: ");
        llnum = Input.nextLong();

        System.out.println("Enter a float number: ");
        lfnum = Input.nextFloat();

        System.out.println("Enter a double number: ");
        ldnum = Input.nextDouble();

        System.out.println("Enter a name: ");
        sname = Input.next();

        System.out.println("Enter a bool value: ");
        bdata = Input.hasNextBoolean();

        System.out.println("Byte: " + lbnum);
        System.out.println("Short: " + lsnum);
        System.out.println("Int: " + linum);
        System.out.println("Long: " + llnum);
        System.out.println("Float: " + lfnum);
        System.out.println("Double: " + ldnum);
        System.out.println("Name: " + sname);
        System.out.println("Boolean: " + bdata);
    }
}
