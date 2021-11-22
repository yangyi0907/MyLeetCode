package leetcode.editor.cn;

import java.util.Arrays;

//16.最接近的三数之和
public class ThreeSumClosest {
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int res = (nums[0] + nums[1] + nums[2]);
            for (int i = 0; i < nums.length; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum=nums[i]+nums[left]+nums[right];
                    if(Math.abs(res-target)>Math.abs(sum-target)){
                        res=sum;
                    }
                    if(sum<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}