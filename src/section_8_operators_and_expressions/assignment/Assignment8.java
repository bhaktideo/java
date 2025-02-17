package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        float theta;

        System.out.println("Enter the value of theta: ");
        theta = Input.nextFloat();

        float sum = (float) (Math.pow(Math.sin(theta),2) + Math.pow(Math.cos(theta),2));

        System.out.println("The result of the equation is: " + sum);
    }
}
