package section_12_arrays;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int length = nums.length;

        System.out.println("Length of the array is: " + length);
        System.out.println("Element at index 2 is: " + nums[2]);

        System.out.println("Elements in array are: ");
        System.out.println(Arrays.toString(nums));

    }
}
