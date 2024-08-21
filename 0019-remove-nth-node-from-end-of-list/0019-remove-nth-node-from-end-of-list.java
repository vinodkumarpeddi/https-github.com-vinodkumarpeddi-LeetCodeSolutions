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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        if(cnt==n)
        {
            return head.next;
        }
        int res=cnt-n;
        temp=head;
        while(temp!=null)
        {
           res--;
           
            if(res==0)
            {
                temp.next=temp.next.next;
                break;

            }
            temp=temp.next;
             
           
        }
      
        return head;


    }
}