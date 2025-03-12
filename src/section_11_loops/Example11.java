package section_11_loops;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        // Power of a number

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the base number: ");
        int base = Input.nextInt();

        System.out.println("Enter the power of number: ");
        int power = Input.nextInt();

        int product = 1;

        for (int i=0; i < power; i++){
            product = product * base;
        }
        System.out.println("Power(" + base + "," + power + ") = " + product);
    }
}
