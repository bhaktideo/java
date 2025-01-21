package section_7_data_types_and_variables;

import java.lang.*;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        float CGPA;
        double collegeFees;

        System.out.println("Enter your CGPA: ");
        CGPA = Input.nextFloat();

        System.out.println("Enter your college fees: ");
        collegeFees = Input.nextDouble();

        System.out.println("Impressive your CGPA is: " + CGPA);
        System.out.println("And your college fees is: " + collegeFees);
    }
}
