package section_11_loops;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        // Print Even Numbers from 2 to n

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the range for printing even numbers: ");
        int n = Input.nextInt();

        for (int i=2; i<=n; i++){
            if (i%2==0){
                System.out.println(i + " ");
            }
        }
    }
}
