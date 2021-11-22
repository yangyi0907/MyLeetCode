package leetcode.editor.cn;
//696.计数二进制子串
public class CountBinarySubstrings {
    public static void main(String[] args) {
        Solution solution = new CountBinarySubstrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countBinarySubstrings(String s) {
        int pre=0,cur=1;
        int count=0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }else {
                pre=cur;
                cur=1;
            }
            if(pre>=cur){
                count++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}