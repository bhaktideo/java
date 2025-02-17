package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int n;

        System.out.println("Enter a number: ");
        n = Input.nextInt();

        double log = Math.log10(n);

        System.out.println("Log of the number is: " + log);
    }
}
