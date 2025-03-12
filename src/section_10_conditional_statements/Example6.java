package section_10_conditional_statements;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the marks of the first subject: ");
        float sub1 = Input.nextFloat();

        System.out.println("Enter the marks of the second subject: ");
        float sub2 = Input.nextFloat();

        System.out.println("Enter the marks of the third subject: ");
        float sub3 = Input.nextFloat();

        float average = (sub1 + sub2 + sub3) / 3;
        System.out.println("Average of the three subjects is: " + average);

        if (average >= 70) {
            System.out.println("Grade A");
        }
        else if ((average >= 60) && (average < 70)) {
            System.out.println("Grade B");
        }
        else if ((average >= 50) && (average < 60)) {
            System.out.println("Grade C");
        }
        else if ((average >= 40) && (average < 50)) {
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}