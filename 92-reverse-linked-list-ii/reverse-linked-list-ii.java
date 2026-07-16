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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode LeftPrev=dummy;
        for(int i=0;i<left-1;i++){
            LeftPrev=LeftPrev.next;
        }
        ListNode curr=LeftPrev.next;
        ListNode TailBefore=curr;
        ListNode prev=null;
        for(int i=0;i<right-left+1;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        LeftPrev.next=prev;
        TailBefore.next=curr;
        return dummy.next;
    }
}