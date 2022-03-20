

class Remove_dups {
    
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

    public void removedups(ListNode head) {
        if (head.next == null) {
            ;
        }
        ListNode nzxt = head;

        while (nzxt != null) {
            // nzxt=nzxt.next;
            ListNode traverser = nzxt;
            while (traverser.next != null) {
                if (traverser.val == nzxt.val) {
                    nzxt = nzxt.next.next;
                    
                }
                else {
                    nzxt=nzxt.next;
                }
                traverser=traverser.next;
            }

        }

    }
}