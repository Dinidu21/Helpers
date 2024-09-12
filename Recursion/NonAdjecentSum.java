package Recursion;

import java.util.Arrays;
import java.util.List;

public class NonAdjecentSum {
    //BruteForce Approach
    private static int nonAdjecentSum(List<Integer> nums) {
        return nonAdjecentSum(nums,0);
    }
    private static int nonAdjecentSum(List<Integer> nums,int i) {
        if(i >= nums.size()){
            return 0; //if is i more than array size
        }
        return Math.max(nums.get(i)+nonAdjecentSum(nums,i + 2),
        nonAdjecentSum(nums,i + 1));
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,5,12,7,12,5,6,8,0);

        System.out.println("arrays Size : "+nums.size());
        int result = nonAdjecentSum(nums);
        System.out.println("Non Adjacent Sum is : " + result);
    }
}
