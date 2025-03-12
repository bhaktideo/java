package section_10_conditional_statements;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a number to know the day: ");
        int day = Input.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("It's Monday");
                break;

            case 2:
                System.out.println("It's Tuesday today");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("It's Thursday");
                break;

            case 5:
                System.out.println("Yay! it's Friday");
                break;

            case 6:
                System.out.println("Finally it's the weekend!! Saturday");
                break;

            case 7:
                System.out.println("Fun day!! Sunday");
                break;

            default:
                System.out.println("Not a valid day");
        }
    }
}
