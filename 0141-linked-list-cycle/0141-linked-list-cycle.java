import java.util.HashMap;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return true;
            } else {
                map.put(temp, 1);
            }
            temp = temp.next; // Move to the next node
        }
        return false;
    }
}
