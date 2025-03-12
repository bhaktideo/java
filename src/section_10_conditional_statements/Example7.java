package section_10_conditional_statements;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num = Input.nextLine();

        if (num.matches("[01]+")){
            System.out.println("Radix 2");
        }
        else if (num.matches("[0-7]+")){
            System.out.println("Radix 8");
        }
        else if (num.matches("[0-9]+")){
            System.out.println("Radix 10");
        }
        else
        {
            System.out.println("Radix 16");
        }
    }
}
