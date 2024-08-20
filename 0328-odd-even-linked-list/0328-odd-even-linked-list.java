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
import java.util.ArrayList;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, return as-is.
        }

        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();

        // Traverse the list and collect odd-indexed node values
        while (temp != null) {
            list.add(temp.val);
            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        // Traverse the list and collect even-indexed node values
        ListNode temp1 = head.next;
        while (temp1 != null) {
            list.add(temp1.val);
            if (temp1.next != null) {
                temp1 = temp1.next.next;
            } else {
                break;
            }
        }

        // Reassign the values from the list back to the linked list
        int i = 0;
        ListNode temp2 = head;
        while (temp2 != null) {
            temp2.val = list.get(i);
            temp2 = temp2.next;
            i++;
        }

        return head;
    }
}
