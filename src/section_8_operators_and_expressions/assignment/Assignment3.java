package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        float a;
        float b;
        float c;

        float x1;
        float x2;

        System.out.println("Enter coefficient a: ");
        a = Input.nextFloat();

        System.out.println("Enter coefficient b: ");
        b = Input.nextFloat();

        System.out.println("Enter constant c: ");
        c = Input.nextFloat();

        x1 = (float) ((-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a);
        x2 = (float) ((-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a);

        System.out.println("Roots of the quadratic equation are: " + x1 + " and " + x2);
    }
}
