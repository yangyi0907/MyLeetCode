package leetcode.editor.cn;

import java.util.Arrays;

//462.最少移动次数使数组元素相等 II
public class MinimumMovesToEqualArrayElementsIi {
    public static void main(String[] args) {
        Solution solution = new MinimumMovesToEqualArrayElementsIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+= Math.abs(nums[i]-mid) ;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}