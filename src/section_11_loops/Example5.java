package section_11_loops;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        // Design Down Counter

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the range for down counter: ");
        int n = Input.nextInt();

        for (int i=n; i>=0; i--){
            System.out.println(i + " ");
        }
    }
}
