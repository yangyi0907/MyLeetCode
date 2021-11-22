package leetcode.daily.D7_6;

public class lc53 {
    public static void main(String[] args) {
        int[] nums =new int[]{1};
        System.out.println(maxSubArray(nums));
    }
    //贪心算法
    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<=0)sum=0;
        }
        return max;
    }
}
