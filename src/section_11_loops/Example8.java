package section_11_loops;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        // Find Sum of n numbers

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the range for sum of numbers: ");
        int n = Input.nextInt();

        int sum = 0;

        System.out.println("Sum of the numbers from 1 to " + n + " is: ");
        for (int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
