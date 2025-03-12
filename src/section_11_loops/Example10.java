package section_11_loops;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        // Reverse the given Number

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Input.nextInt();

        int rev = 0;
        int rem = 0;

        System.out.println("The given number is: " + num);

        while (num!=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reversed number is: " + rev);
    }
}
