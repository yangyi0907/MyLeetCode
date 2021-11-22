package leetcode.editor.cn;
//面试题 05.01.插入
public class InsertIntoBitsLcci {
    public static void main(String[] args) {
        Solution solution = new InsertIntoBitsLcci().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int insertBits(int N, int M, int i, int j) {
        return N+(M<<i);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}