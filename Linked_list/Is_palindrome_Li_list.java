package Linked_list;
class Is_palindrome_Li_list {
    /* Definition for singly-linked list. */
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

    public ListNode reverser(ListNode head) {//could us recursion also
       
        ListNode curr_node = head;
        ListNode prev_node = null;
        while (curr_node != null) {
            ListNode next_node=curr_node.next;
            curr_node.next = prev_node;
            prev_node = curr_node;
            curr_node=next_node;

        }
        // head.next = null;
        return prev_node;
    }
    
    public ListNode centerer(ListNode head){
        ListNode hare=head;
        ListNode tortoise=head;
        while(hare.next != null && hare.next.next!= null){
            hare=hare.next.next;
            tortoise=tortoise.next;

        }
        return tortoise;

        }
    
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode center=centerer(head);
        ListNode sec_part=reverser(center.next);
        ListNode first_part=head;
        while(sec_part!=null){
            if(sec_part.val!=first_part.val){
                return false;
            }
            sec_part=sec_part.next;
            first_part=first_part.next;
        }
        return true;
        
    }
}