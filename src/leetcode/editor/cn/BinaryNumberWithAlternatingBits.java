package leetcode.editor.cn;

//693.交替位二进制数
public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        Solution solution = new BinaryNumberWithAlternatingBits().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean hasAlternatingBits(int n) {
            int temp = n % 2;
            while (n != 0) {
                n >>= 1;
                if (temp == n % 2) {
                    return false;
                }
                temp = n % 2;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}