package leetcode.hot.lc53;

public class Test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums=new int[]{-1};
        int max=solution.maxSubArray(nums);
        System.out.println(max);
    }


}
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int length = nums.length;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; i+j<=length; j++) {
                int n=i;//个数
                int m=j;//起始位置
                int add=0;
                while (n-->0){
                    add+=nums[m++];
                }
                if(add>max){
                    max=add;
                }
            }
        }
        return max;
    }
}