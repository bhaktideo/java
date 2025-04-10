package section_13_methods;

public class Example12 {
    static int max(int...nums)
    {
        if(nums.length == 0)
        {
            return Integer.MIN_VALUE;
        }

        int lnMax = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            if(nums[i] > lnMax)
            {
                lnMax = nums[i];
            }
        }

        return lnMax;
    }

    public static void main(String[] args)
    {
        int maxData = max(1,5,-10);
        System.out.println("Max: " + maxData);

        maxData = max(10,20,30);
        System.out.println("Max: " + maxData);

        maxData = max(10,20,30,40,50);
        System.out.println("Max: " + maxData);
    }
}
