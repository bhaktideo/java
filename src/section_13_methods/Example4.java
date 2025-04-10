package section_13_methods;

import java.util.Scanner;

public class Example4 {

    // Calculate volume and area

    public static float volume(float length, float breadth, float height){
        float volume = length * breadth * height;
        return volume;
    }

    public static float area(float length, float breadth){
        float area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the length: ");
        float length = Input.nextFloat();

        System.out.println("Enter the breadth: ");
        float breadth = Input.nextFloat();

        System.out.println("Enter the height: ");
        float height = Input.nextFloat();

        float result = volume(length, breadth, height);
        System.out.println("Volume: " + result);

        result = area(length, breadth);
        System.out.println("Area: " + result);
    }
}
