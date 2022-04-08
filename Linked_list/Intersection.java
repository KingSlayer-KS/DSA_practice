package Linked_list;
class Solution {

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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode b = headB;
        ListNode a = headA;
        while (a != b) {
            /*
             * //didnt work
             * if(b.next==null){
             * b=headA;
             * 
             * }else{
             * b=b.next;
             * }
             * if(a.next==null){
             * a=headB;
             * 
             * }else{
             * a=a.next;
             */

            b = b == null ? headA : b.next;
            a = a == null ? headB : a.next;
        }

        return b;

    }
}
