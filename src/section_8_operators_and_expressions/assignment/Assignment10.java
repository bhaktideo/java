package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Enter first integer: ");
        a = Input.nextInt();

        System.out.println("Enter second integer: ");
        b = Input.nextInt();

        System.out.println("Enter third integer: ");
        c = Input.nextInt();

        int min1 = Math.min(a,b);
        int min = Math.min(min1,c);
        int max1 = Math.max(a,b);
        int max = Math.max(max1,c);

        System.out.println("Minimum of the three numbers is: " + min);
        System.out.println("Maximum of the three numbers is: " + max);
    }
}
