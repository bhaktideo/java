package section_12_arrays;

public class Example6 {
    public static void main(String[] args) {

        // Maximum element in the array

        int[] nums = {12,45,7,89,23,56};

        int max = nums[0];

        for (int i=1; i<nums.length; i++){
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}
