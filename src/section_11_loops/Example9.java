package section_11_loops;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        // Calculate the Factorial of a number

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = Input.nextInt();

        int fact = 1;

        System.out.println("Factorial of " + n + " is: ");
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
