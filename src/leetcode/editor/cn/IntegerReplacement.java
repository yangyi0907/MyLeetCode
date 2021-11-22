package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//397.整数替换
public class IntegerReplacement {
    public static void main(String[] args) {
        Solution solution = new IntegerReplacement().new Solution();
        solution.integerReplacement(7);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        Map<Long, Integer> map = new HashMap<>();

        public int integerReplacement(int n) {
            return dfs(n * 1L);
        }

        int dfs(long n) {
            if (n == 1) return 0;
            if (map.containsKey(n)) return map.get(n);
            int ans = n % 2 == 0 ? dfs(n / 2) : Math.min(dfs(n + 1), dfs(n - 1));
            map.put(n, ++ans);
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}