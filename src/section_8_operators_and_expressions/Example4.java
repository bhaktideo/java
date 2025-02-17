package section_8_operators_and_expressions;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        float fBase;
        float fHeight;

        System.out.println("Enter base of triangle: ");
        fBase = Input.nextFloat();

        System.out.println("Enter height of triangle: ");
        fHeight = Input.nextFloat();

        float fArea = (fBase + fHeight) / 2;
        System.out.println("Area of Triangle: " + fArea);
    }
}
