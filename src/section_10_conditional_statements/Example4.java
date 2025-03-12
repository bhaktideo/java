package section_10_conditional_statements;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = Input.nextInt();

        System.out.println("Enter the second number: ");
        int b = Input.nextInt();

        System.out.println("Enter the third number: ");
        int c = Input.nextInt();

        if ((a > b) && (a > c)){
            System.out.println(a + " is the greater number");
        }
        else if(b > c){
            System.out.println(b + " is the greater number");
        }
        else{
            System.out.println(c + " is the greater number");
        }
    }
}
