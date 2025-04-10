package section_13_methods;

import java.util.Scanner;

public class Example5 {

    // Prime number

    static boolean isPrime(int num){
        boolean flag = true;

        for (int i=2; i<num/2; i++){
            if (num % i == 0){
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = Input.nextInt();

        boolean result = isPrime(n);

        if (result){
            System.out.println(n + " Is A Prime Number");
        }
        else {
            System.out.println(n + " Is Not A Prime Number");
        }
    }

}
