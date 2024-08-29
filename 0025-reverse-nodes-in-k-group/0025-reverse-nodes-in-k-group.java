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
    public ListNode findk(ListNode head,int k)
    {
        k-=1;
        ListNode temp=head;
        while(temp!=null && k>0)
        {
            k--;
            temp=temp.next;
        }
        return temp;
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevLast=null;
        while(temp!=null)
        {
            ListNode kthnode=findk(temp,k);
            if(kthnode==null)
            {
                if(prevLast!=null) prevLast.next=temp;
                break;
            }
            ListNode newnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head)
            {
                head=kthnode;
            }
            else
            {
                 prevLast.next=kthnode;
            }
            prevLast=temp;
            temp=newnode;
        }
        return head;
    }
}