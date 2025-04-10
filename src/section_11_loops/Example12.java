package section_11_loops;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        // Display Numbers in Words

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Input.nextInt();

        String result = "";

        int rem = 0;

        while (num!=0){

            rem = num % 10;
            num = num / 10;

            switch (rem){
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        System.out.println(result);
    }
}
