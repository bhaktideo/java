package section_7_data_types_and_variables;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Enter a number: ");
        a = Input.nextInt();

        System.out.println("Enter a number: ");
        b = Input.nextInt();

        c = a + b;
        System.out.println("Sum: " + c);
    }
}
