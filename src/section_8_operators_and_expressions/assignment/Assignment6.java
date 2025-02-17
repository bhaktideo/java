package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int min;
        int max;

        double num;

        System.out.println("Enter min value: ");
        min = Input.nextInt();

        System.out.println("Enter max value: ");
        max = Input.nextInt();

        num = min + Math.random() % max;

        System.out.println("Random number generated is: " + num);
    }
}
