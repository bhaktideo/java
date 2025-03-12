package section_10_conditional_statements;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the website to be checked: ");
        String website = Input.nextLine();

        int index = website.lastIndexOf(".");

        String data = website.substring(index+1);

        switch (data)
        {
            case "com":
                System.out.println("It's a commercial website");
                break;

            case "org":
                System.out.println("It's an organizational website");
                break;

            case "edu":
                System.out.println("It's an educational website");
                break;

            case "net":
                System.out.println("It's a networking website");
                break;

            default:
                System.out.println("Invalid website");
        }
    }
}
