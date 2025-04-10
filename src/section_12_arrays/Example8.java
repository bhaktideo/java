package section_12_arrays;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {

        // Right rotate array

        int[] nums = {45,26,9,10,17};
        System.out.println("Original array elements: " + Arrays.toString(nums));

        int temp = nums[nums.length-1];

        for (int i=nums.length-2; i>=0; i--){
            nums[i+1] = nums[i];
        }
        nums[0] = temp;

        System.out.println("Array elements after right rotation: " + Arrays.toString(nums));
    }
}
