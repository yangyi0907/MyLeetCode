package leetcode.daily.D7_6;

import org.junit.Test;

public class Solution {
    public static void main(String[] args) {
        int[] nums=new int[]{-1,2,3,1};
        boolean i= containsDuplicate(nums);
        System.out.println(i);
    }
    public static boolean containsDuplicate(int[] nums) {
        int lenth=nums.length;
        int[] nz=new int[1000000];
        int[] nf=new int[1000000];
        for (int i = 0; i < lenth; i++) {
            if(nums[i]>=0){
                if(nz[nums[i]]==1){
                    return true;
                }else {
                    nz[nums[i]]=1;
                }
            }else {
                if(nf[-nums[i]]==1){
                    return true;
                }else {
                    nf[-nums[i]]=1;
                }
            }

        }
        return false;
    }
}
