/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        ListNode prev=head;
        if(head.next==null) return null;
        while(f!=null && f.next!=null){
            f=f.next.next;
            prev=s;
            s=s.next;
        }
        prev.next=s.next;
       return head;
    }
}