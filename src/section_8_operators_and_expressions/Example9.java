package section_8_operators_and_expressions;

public class Example9 {
    public static void main(String[] args) {

        int x = 10;
        int y = 6;
        int z;

        z = x & y;
        System.out.println("x & y: " + z);

        z = x | y;
        System.out.println("x | y: " + z);

        z = x ^ y;
        System.out.println("x ^ y: " + z);

        int result;

        result = x;
        System.out.println("Bit pattern: " + Integer.toBinaryString(result));

        result = ~x;
        System.out.println("Bit pattern: " + Integer.toBinaryString(result));

        result = x << 1;
        System.out.println("Left shift x: " + result);

        result = y >> 1;
        System.out.println("Right shift y: " + result);
    }
}
