package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        float a;
        float b;

        float c;

        System.out.println("Enter the first side: ");
        a = Input.nextFloat();

        System.out.println("Enter the second side: ");
        b = Input.nextFloat();

        c = (float) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("Hypotenuse of triangle is: " + c);
    }
}
