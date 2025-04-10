package section_13_methods;

import java.util.Scanner;

public class Example6 {

    // GCD of a number

    static int gcd(int m, int n){

        while (m!=n){

            if (m > n){
                m = m - n;
            }
            else {
                n = n-m;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = Input.nextInt();

        System.out.println("Enter the second number: ");
        int b = Input.nextInt();

        int result = gcd(a,b);

        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}
