class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // If the list is empty or has only one node, return null
        }

        // Count the number of nodes in the list
        ListNode temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // Special case for when the list has only two nodes
        if (cnt == 2) {
            head.next = null;
            return head;
        }

        // Find the node just before the middle node
        int middle = cnt / 2;
        temp = head;
        for (int i = 1; i < middle; i++) { // Stop just before the middle node
            temp = temp.next;
        }

        // Delete the middle node
        temp.next = temp.next.next;

        return head;
    }
}
