package section_11_loops;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        // Design Up Counter

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the range for up counter: ");
        int n = Input.nextInt();

        for (int i=0; i<=n; i++){
            System.out.println(i + " ");
        }
    }
}
