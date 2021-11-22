package leetcode.hot.lc206;

public class Test {
    public static void main(String[] args) {
        Solution sol=new Solution();
        ListNode head1=new ListNode(0,null);
        System.out.println(sol.reverseList(head1));
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode p=head;
        ListNode pre=null;
        while (p.next!=null){
            pre=p.next;
            p.next=pre.next;
            pre.next=head;
            head=pre;

        }
        return head;
    }
}