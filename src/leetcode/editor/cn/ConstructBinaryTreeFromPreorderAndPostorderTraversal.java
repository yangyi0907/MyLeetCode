package leetcode.editor.cn;

//889.根据前序和后序遍历构造二叉树
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ConstructBinaryTreeFromPreorderAndPostorderTraversal().new Solution();
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
        public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
            if(preorder.length==0)return null;
            TreeNode root = dfs(preorder, postorder, 0, preorder.length - 1, 0, preorder.length - 1);
            return root;
        }
        public TreeNode dfs(int[] preorder,int[] postorder,int pre_start,int pre_end,int post_start,int post_end){
            if(pre_start>pre_end)return null;
            TreeNode root = new TreeNode(preorder[pre_start]);
            if(pre_start==pre_end)return root;
            for (int i = post_start; i <=post_end-1 ; i++) {
                if(preorder[pre_start+1]==postorder[i]){
                    root.left=dfs(preorder,postorder,pre_start+1,i-post_start+pre_start+1,post_start,i);
                    root.right=dfs(preorder,postorder,i-post_start+pre_start+2,pre_end,i+1,post_end-1);
                    break;
                }
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}