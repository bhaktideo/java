package section_12_arrays;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        // Linear Search

        int[] nums = {10,25,30,45,50};

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = Input.nextInt();

        int index = -1;

        for (int i=0; i<nums.length; i++){
            if (nums[i] == n){
                index = i;
                break;
            }
        }

        if (index != -1){
            System.out.println("Number found at index: " + index);
        }
        else {
            System.out.println("Number not found");
        }
    }
}
