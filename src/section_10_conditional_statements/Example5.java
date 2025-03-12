package section_10_conditional_statements;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Input.nextInt();

        if (num % 2 == 0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
