package section_8_operators_and_expressions;

import java.lang.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        float a;
        float b;
        float c;

        float s;
        float area;

        System.out.println("Enter the first side of triangle: ");
        a = Input.nextFloat();

        System.out.println("Enter the second side of triangle: ");
        b = Input.nextFloat();

        System.out.println("Enter the third side of triangle: ");
        c = Input.nextFloat();

        s = (a + b + c)/2f;
        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of the triangle is: " + area);
    }
}
