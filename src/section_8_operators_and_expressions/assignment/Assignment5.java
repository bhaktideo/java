package section_8_operators_and_expressions.assignment;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int n;
        double fact;
        double result = 0;

        System.out.println("Enter a number to calculate factorial: ");
        n = Input.nextInt();

        for(int i=1; i<=n; i++)
        {
            result = result + Math.log(i);
        }

        fact = Math.pow(Math.E,result);

        System.out.println("Factorial of the number is: " + fact);
    }
}
