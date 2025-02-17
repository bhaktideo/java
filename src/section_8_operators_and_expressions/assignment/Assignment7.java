package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        float dAngle;
        double rAngle1;
        double rAngle2;

        System.out.println("Enter the angle in degrees: ");
        dAngle = Input.nextFloat();

        rAngle1 = dAngle * Math.PI / 180;
        rAngle2 = Math.toRadians(dAngle);

        System.out.println("Converting angle from radians to degrees using formula: " + rAngle1);
        System.out.println("Converting angle from radians to degrees using function: " + rAngle2);
    }
}
