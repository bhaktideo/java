package section_10_conditional_statements;

import java.util.Locale;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = Input.nextInt();

        System.out.println("Enter the second number: ");
        int b = Input.nextInt();

       String operation = "mul";

        switch (operation)
        {
            case "add":
                System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
                break;

            case "sub":
                System.out.println("Subtraction of " + a + " and " + b + " is: " + (a-b));
                break;

            case "mul":
                System.out.println("Multiplication of " + a + " and " + b + " is: " + (a*b));
                break;

            case "div":
                System.out.println("Division of " + a + " and " + b + " is: " + (a/b));
                break;

            case "mod":
                System.out.println("Modulus of " + a + " and " + b + " is: " + (a%b));
                break;

            default:
                System.out.println("Not a valid operation");
        }
    }
}
