package section_12_arrays;

public class Example2 {
    public static void main(String[] args) {

        // Reverse array elements

        int[] nums = {1,2,3,4,5};

        System.out.println("Array elements in forward order are: ");

        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("Array elements in reverse order are: ");

        for (int j=nums.length-1; j>=0; j--){
            System.out.println(nums[j]);
        }
    }
}
