package leetcode.editor.cn;
//342.4的幂
public class PowerOfFour {
    public static void main(String[] args) {
        Solution solution = new PowerOfFour().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)return false;
        while (n%4==0){
            n/=4;
        }
        return n==1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}