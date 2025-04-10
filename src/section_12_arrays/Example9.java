package section_12_arrays;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {

        // Left rotate array

        int[] arr = {4,1,81,16,55,33};
        System.out.println("Original array elements: " + Arrays.toString(arr));

        int temp = arr[0];
        for (int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        System.out.println("Array elements after left rotation are: " + Arrays.toString(arr));
    }
}
