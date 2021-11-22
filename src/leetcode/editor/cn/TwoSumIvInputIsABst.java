package leetcode.editor.cn;

import java.util.ArrayList;

//653.两数之和 IV - 输入 BST
public class TwoSumIvInputIsABst {
    public static void main(String[] args) {
        Solution solution = new TwoSumIvInputIsABst().new Solution();
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
        ArrayList<Integer> list = new ArrayList<>();

        public boolean findTarget(TreeNode root, int k) {
            DFS(root);
            int i=0,j=list.size()-1;
            while (i<j){
                int sum=list.get(i)+list.get(j);
                if(sum==k){
                    return true;
                }else if(sum<k){
                    i++;
                }else {
                    j--;
                }
            }
            return false;
        }
        public void DFS(TreeNode root){
            if(root==null)return;
            DFS(root.left);
            list.add(root.val);
            DFS(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}