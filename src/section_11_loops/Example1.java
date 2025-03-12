package section_11_loops;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        // Count the number of digits in the given number

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Input.nextInt();

        int count = 0;
        while (num!=0){
            num = num / 10;
            count++ ;
        }
        System.out.println("The number of digits in the number is: " + count);
    }
}
