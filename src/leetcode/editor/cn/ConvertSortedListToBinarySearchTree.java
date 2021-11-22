package leetcode.editor.cn;

//109.有序链表转换二叉搜索树
public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ConvertSortedListToBinarySearchTree().new Solution();
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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
    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) return null;
            else if (head.next == null) return new TreeNode(head.val);
            ListNode fast=head;
            ListNode low=head;
            ListNode pre=low;
            while (fast!=null&&fast.next!=null){
                fast=fast.next.next;
                pre=low;
                low=low.next;
            }
            TreeNode root=new TreeNode(low.val);
            root.right=sortedListToBST(low.next);
            pre.next=null;
            root.left=sortedListToBST(head);
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}