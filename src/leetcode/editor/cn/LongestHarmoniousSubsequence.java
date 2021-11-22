package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//594.最长和谐子序列
public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        Solution solution = new LongestHarmoniousSubsequence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findLHS(int[] nums) {
            HashMap<Integer, Integer> list = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                list.put(nums[i], list.getOrDefault(nums[i], 0) + 1);
            }
            int max = 0;
            Set<Map.Entry<Integer, Integer>> entries = list.entrySet();
            Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> next = iterator.next();
                Integer key = next.getKey();
                int x1 = Math.max(list.getOrDefault(key + 1, 0), list.getOrDefault(key - 1, 0));
                if (x1 != 0) {
                    max = Math.max(max, x1 + next.getValue());
                }
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}