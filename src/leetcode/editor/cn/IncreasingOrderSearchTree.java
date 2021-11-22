package leetcode.editor.cn;

import java.util.ArrayList;

//897.递增顺序搜索树
public class IncreasingOrderSearchTree {
    public static void main(String[] args) {
        Solution solution = new IncreasingOrderSearchTree().new Solution();
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
        ArrayList<TreeNode> list = new ArrayList<>();

        public TreeNode increasingBST(TreeNode root) {
            DFS(root);
            for (int i = 0; i < list.size()-1; i++) {
                list.get(i).left=null;
                list.get(i).right=list.get(i+1);
            }
            list.get(list.size()-1).left=null;
            list.get(list.size()-1).right=null;
            return list.get(0);
        }

        public void DFS(TreeNode root) {
            if (root == null) return;
            DFS(root.left);
            list.add(root);
            DFS(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}