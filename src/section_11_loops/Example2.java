package section_11_loops;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        // Count the sum of the digits in the given number

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Input.nextInt();

        int sum = 0;
        int rem = 0;

        while (num!=0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("The sum of the digits in the number is: " + sum);
    }
}
