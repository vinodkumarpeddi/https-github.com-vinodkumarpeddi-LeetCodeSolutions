class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;  // Update odd.next
            even.next = even.next.next; // Update even.next
            odd = odd.next; // Move odd to the next odd node
            even = even.next; // Move even to the next even node
        }

        odd.next = evenHead; // Connect the end of odd list to the start of even list

        return head;
    }
}
