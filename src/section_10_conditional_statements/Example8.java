package section_10_conditional_statements;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = Input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("This is A Leap Year");
            }
        }
        else {
            System.out.println("This is Not a Leap Year");
        }
    }
}
