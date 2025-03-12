package section_11_loops;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        // Generate Multiplication Table of x

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = Input.nextInt();

        System.out.println("Multiplication table of " + n + " is:");
        for (int i=1; i<=10; i++){
            System.out.println(n + "*" + i + " = " + (n*i));
        }
    }
}
