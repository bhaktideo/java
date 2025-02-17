package section_8_operators_and_expressions;

public class Example10 {
    public static void main(String[] args) {

        int x = 0b1010;
        int y = 0b0110;
        int z;

        z = x | y;
        System.out.println("x | y: " + z);

        z = x ^ y;
        System.out.println("x ^ y: " + z);

        z = x & y;
        System.out.println("x & y: " + z);

        x = -0b1010;
        System.out.println(x);
    }
}
