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
    public void reorderList(ListNode head) {
        //Find Middle Node
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //Split into 2 Halfes
        ListNode second=slow.next;
        slow.next=null;
        //Reverse 2nd Half;
        second=reverse(second);
        //Merge
        ListNode first=head;
        ListNode sec=second;
        while(sec!=null){
            ListNode t1=first.next;
            ListNode t2=sec.next;
            first.next=sec;
            sec.next=t1;
            first=t1;
            sec=t2;
        }
        
    }
        
        
        private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}