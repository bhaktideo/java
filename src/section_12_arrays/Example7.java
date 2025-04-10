package section_12_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {

        // Second largest element in array

        int[] nums = {10,25,36,78,45,89,56};
        System.out.println("Array elements: " + Arrays.toString(nums));

        int largest = nums[0];
        int secondLargest = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }
        }
        System.out.println("Second largest element: " + secondLargest);
    }
}
