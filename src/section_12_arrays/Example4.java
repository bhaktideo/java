package section_12_arrays;

public class Example4 {
    public static void main(String[] args) {

        // Sum of array elements

        int[] num = {5,10,15,20,25};

        System.out.println("Array elements: ");

        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        int sum = 0;

        for (int i=0; i<num.length; i++){
            sum = sum + num[i];
        }

        System.out.println("Sum of array elements is: " + sum);
    }
}
