package leetcode.editor.cn;

import java.util.List;

//面试题 02.04.分割链表
public class PartitionListLcci {
    public static void main(String[] args) {
        Solution solution = new PartitionListLcci().new Solution();
    }
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
    //leetcode submit region begin(Prohibit modification and deletion)


class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode head1=new ListNode(0);
        head1.next=head;
        ListNode head2=new ListNode(0);
        ListNode p1=head1;
        ListNode p2=head2;
        while (p1.next!=null){
            if(p1.next.val<x){
                p2.next=p1.next;
                p2=p2.next;
                p1.next=p1.next.next;
            }else {
                p1=p1.next;
            }
        }
        p2.next=head1.next;
        return head2.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}