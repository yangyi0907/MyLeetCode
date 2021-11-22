package leetcode.editor.cn;

//1009.十进制整数的反码
public class ComplementOfBase10Integer {
    public static void main(String[] args) {
        Solution solution = new ComplementOfBase10Integer().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int bitwiseComplement(int num) {
            if(num==0)return 1;
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