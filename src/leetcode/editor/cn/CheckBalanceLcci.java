package leetcode.editor.cn;

import com.sun.source.tree.Tree;

//面试题 04.04.检查平衡性
public class CheckBalanceLcci {
    public static void main(String[] args) {
        Solution solution = new CheckBalanceLcci().new Solution();
    }
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
    //leetcode submit region begin(Prohibit modification and deletion)


class Solution {
    public boolean isBalanced(TreeNode root) {
        int high = high(root);
        return high!=-1;
    }
    public int high(TreeNode root){
        if(root==null)return 0;
        int l = high(root.left);
        int r = high(root.right);
        if(l==-1||r==-1||Math.abs(l-r)>1) return -1;
        return Math.max(l,r)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}