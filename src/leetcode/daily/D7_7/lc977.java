package leetcode.daily.D7_7;

import java.util.Arrays;

public class lc977 {
    public static void main(String[] args) {
        int[] nums=new int[]{-4,-1,0,3,10};
    }
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(int)Math.pow(nums[i],2);
        }
        /*for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/
        Arrays.sort(nums);
        return nums;
    }
}
