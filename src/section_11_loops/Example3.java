package section_11_loops;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        // Calculate the GCD of two given numbers

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = Input.nextInt();

        System.out.println("Enter the second number: ");
        int b = Input.nextInt();

        while (a!=b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println("GCD of the two numbers is: " + a);
    }
}
