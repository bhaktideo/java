package section_8_operators_and_expressions;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        float r;
        float h;

        double totalSurfaceArea;

        System.out.println("Enter the radius of cylinder: ");
        r = Input.nextFloat();

        System.out.println("Enter the height of cylinder: ");
        h = Input.nextFloat();

        totalSurfaceArea = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r,2));

        System.out.println("Total Surface Area of cylinder is: " + totalSurfaceArea);
    }
}
