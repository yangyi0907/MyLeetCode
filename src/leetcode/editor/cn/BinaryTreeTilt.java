package leetcode.editor.cn;

import java.util.Date;

//563.二叉树的坡度
public class BinaryTreeTilt {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeTilt().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        int sum = 0;

        public int findTilt(TreeNode root) {
            Dfs(root);
            return sum;
        }

        public int Dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int l = Dfs(root.left);
            int r = Dfs(root.right);
            root.val += l + r;
            sum += Math.abs(l - r);
            return root.val;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}