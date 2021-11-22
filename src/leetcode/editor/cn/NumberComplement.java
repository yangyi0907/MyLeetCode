package leetcode.editor.cn;

//476.数字的补数
public class NumberComplement {
    public static void main(String[] args) {
        Solution solution = new NumberComplement().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findComplement(int num) {
            int n = -1;
            for (int i = 31; i >= 0; i--) {
                if (((num >> i) & 1) != 0) {
                    n = i;
                    break;
                }
            }
            int ans = 0;
            for (int i = 0; i <= n; i++) {
                if (((1 << i) & num) == 0) {
                    ans |= (1 << i);
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}