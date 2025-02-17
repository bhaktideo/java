package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int a;
        int b;
        int power;

        System.out.println("Enter a number: ");
        a = Input.nextInt();

        System.out.println("Enter a number: ");
        b = Input.nextInt();

        power = (int) Math.pow(a,b);

        System.out.println("The result of the power equation is: " + power);
    }
}
