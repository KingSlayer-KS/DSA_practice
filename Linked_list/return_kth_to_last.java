package Linked_list;

public class return_kth_to_last {

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

        public int returnkthtolast(ListNode head, int k, int ix) {
            if (head.next == null || head == null) {
                return 0;
            }
            if (ix == k) {
                System.out.println(head.val);
            }
            returnkthtolast(head.next, k, ix + 1);
            return ix;

        }

    }
}
