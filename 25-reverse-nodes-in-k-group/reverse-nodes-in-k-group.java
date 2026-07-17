class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // 1. Check if there are at least k nodes left
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        
        // If we have fewer than k nodes, leave them as they are
        if (count < k) {
            return head;
        }
        
        // 2. Reverse the first k nodes
        curr = head;
        ListNode prev = null;
        ListNode next = null;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // 3. 'head' is now the tail of the reversed group.
        // Element 'next' is the head of the next group.
        // Recursively reverse the remaining nodes and connect them.
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        
        // 4. 'prev' is the new head of this reversed group
        return prev;
    }
}