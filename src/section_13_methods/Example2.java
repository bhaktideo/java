package section_13_methods;

public class Example2 {

    static float add(float x, float y){
        return x+y;
    }

    static float sub(float x, float y){
        return x-y;
    }

    static float mul(float x, float y){
        return x*y;
    }

    static float div(float x, float y){
        return x/y;
    }

    public static void main(String[] args) {

        float a = 15.25f;
        float b = 10.50f;

        float c = add(a,b);
        System.out.println("Addition: " + c);

        c = sub(a,b);
        System.out.println("Subtraction: " + c);

        c = mul(a,b);
        System.out.println("Multiplication: " + c);

        c = div(a,b);
        System.out.println("Division: " + c);
    }
}
