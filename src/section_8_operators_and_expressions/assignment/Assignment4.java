package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        float a;
        int round;
        int ceil;
        int floor;

        System.out.println("Enter a floating point number: ");
        a = Input.nextFloat();

        round = Math.round(a);
        ceil = (int) Math.ceil(a);
        floor = (int) Math.floor(a);

        System.out.println("Rounded value is: " + round);
        System.out.println("Ceiling value is: " + ceil);
        System.out.println("Floor value is: " + floor);
    }
}
