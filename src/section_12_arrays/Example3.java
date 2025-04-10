package section_12_arrays;

public class Example3 {
    public static void main(String[] args) {

        // Use a mutable for loop to double each element's value

        int[] nums = {2,4,6,8,10};

        System.out.println("Original array elements: ");

        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("Modified array elements: ");

        for (int j=0; j<nums.length; j++){
            nums[j] = nums[j] * 2;
        }
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
