package leetcode.editor.cn;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;

//409.最长回文串
public class LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new LongestPalindrome().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindrome(String s) {
        int[] temp=new int[128];
        for (int i = 0; i < s.length(); i++) {
            temp[s.charAt(i)]++;
        }
        int flag=0;
        int ans=0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]%2==0){
                ans+=temp[i];
            }else {
                ans+=temp[i]-1;
                flag=1;
            }
        }
        ans+=flag;
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}