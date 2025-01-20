package section_6_debugging_and_scanner_class;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        byte x1;
        short x2;
        int x3;
        long x4;

        float x5;
        double x6;

        System.out.println("Enter a number in byte data format: ");
        x1 = Input.nextByte();

        System.out.println("Enter a number in short data format: ");
        x2 = Input.nextShort();

        System.out.println("Enter a number in int data format: ");
        x3 = Input.nextInt();

        System.out.println("Enter a number in long data format: ");
        x4 = Input.nextLong();

        System.out.println("Enter a number in float data format: ");
        x5 = Input.nextFloat();

        System.out.println("Enter a number in double data format: ");
        x6 = Input.nextDouble();
    }
}
