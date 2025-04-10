package section_13_methods;

public class Example8 {

    // Method overloading

    static int max(int x, int y){
        return Math.max(x,y);
    }

    static float max(float a, float b){
        return Math.max(a,b);
    }

    static int max(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    public static void main(String[] args) {

        int num1 = 23;
        int num2 = 43;

        int max1 = max(num1,num2);
        System.out.println("Max: " + max1);

        float fnum1 = 23.54f;
        float fnum2 = 122.53f;

        float max2 = max(fnum1,fnum2);
        System.out.println("Max: " + max2);

        int num3 = 87;

        int max3 = max(num1, num2, num3);
        System.out.println("Max: " + max3);
    }
}
