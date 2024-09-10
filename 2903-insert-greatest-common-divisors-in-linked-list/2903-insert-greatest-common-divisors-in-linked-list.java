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
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode front=head;
        ListNode last=head.next;
        
     while(last!=null)
     {
           int dat=gcd(front.val,last.val);
           ListNode newnode=new ListNode(dat);
           front.next=newnode;
           newnode.next=last;
           front=newnode.next;
           last=last.next;
           
     }
     return head;

    }
}