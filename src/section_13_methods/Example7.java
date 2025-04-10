package section_13_methods;

public class Example7 {

    // Maximum element in an array

    static int max(int[] nums)
    {
        int result = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            if(result < nums[i])
            {
                result = nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {12,57,78,99,8,32};
        int maxElement = max(nums);
        System.out.println("Max Element: " + maxElement);

    }
}
