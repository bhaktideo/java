package section_9_string_class_and_printing;

public class Example1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.printf("The sum of %d and %d is %d \n",x,y,x+y);
        System.out.println("The sum of " + x + " and " + y + " is " + (x+y));

        System.out.printf("Octal %o \n",x);
        System.out.printf("Hexadecimal %x \n",x);

        float f1 = 2334.2787f;
        System.out.printf("Float %f \n",f1);
        System.out.printf("Float %e \n",f1);
        System.out.printf("Float %g \n",f1);

        double d1 = 32.21543623;
        System.out.printf("Double %.15f \n",d1);

        boolean isEven = true;
        System.out.printf("Boolean %b \n",isEven);

        char c1 ='A';

        String name;
        String aboutMe;
        String skills;

        name = "Bhakti";
        aboutMe = "I'm a JAVA developer intern";
        skills = "JAVA,Python,SQL";

        System.out.printf("Hello, My name is %s. %s. My skills include %s. My grade is %c.\n", name, aboutMe, skills, c1);

    }
}
