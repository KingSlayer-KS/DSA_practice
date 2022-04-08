package Linked_list;
public class delete_middle {

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

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode prev = null,
                hare = head,
                tortoise = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            prev = tortoise;
            tortoise = tortoise.next;

        }
        if (tortoise == head) {
            return null;
        }
        prev.next = tortoise.next;
        return head;

    }
}
