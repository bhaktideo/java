package section_10_conditional_statements;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Input.nextInt();

        if(num > 0) {
            System.out.println("The number is Positive");
        }
        else if (num < 0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("It's a Zero");
        }
    }
}
