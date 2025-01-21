package section_7_data_types_and_variables;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String name;
        String lineAboutYou;

        System.out.println("Hello, may I know your name: ");
        name = Input.next();

        Input.nextLine();

        System.out.println("Can you describe yourself in a single line? ");
        lineAboutYou = Input.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Wow!! That's some hard stuff: " + lineAboutYou);
    }
}
