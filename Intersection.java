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

    public ListNode Intersection(ListNode head_a, ListNode head_b) {
        if (head_a == null || head_b == null) {
            return null;
        }
        ListNode head_b_tracker=head_b;
        ListNode head_a_tracker=head_a;
        while(head_a_tracker == head_b_tracker){
            if(head_b_tracker.next==null){
                head_b_tracker=head_a;

            }else{
                head_b_tracker=head_b_tracker.next;
            }
            if(head_a_tracker.next==null){
                head_a_tracker=head_b;

            }else{
                head_a_tracker=head_a_tracker.next;
            }

        }
        return head_b_tracker;
    }

}
