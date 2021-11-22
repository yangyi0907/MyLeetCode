package leetcode.editor.cn;

//318.最大单词长度乘积
public class MaximumProductOfWordLengths {
    public static void main(String[] args) {
        Solution solution = new MaximumProductOfWordLengths().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProduct(String[] words) {
            int[] temp = new int[words.length];
            int idx = 0;
            for (String word : words) {
                int mask = 0;
                for (int i = 0; i < word.length(); i++) {
                    mask |= 1 << (word.charAt(i) - 'a');
                }
                temp[idx++] = mask;
            }
            int ans = 0;
            for (int i = 0; i < temp.length - 1; i++) {
                for (int j = i + 1; j < temp.length; j++) {
                    if ((temp[i] & temp[j]) == 0) {
                        ans = Math.max(ans, words[i].length()* words[j].length());
                    }
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}