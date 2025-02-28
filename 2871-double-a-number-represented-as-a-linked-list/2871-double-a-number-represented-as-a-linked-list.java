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
    public ListNode Reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) 
    {
       
       ListNode hnode = Reverse(head);
       ListNode first = new ListNode(-1);
       ListNode temp = first;
        int carry = 0;
       while(hnode != null)
       {
            int sum = hnode.val + hnode.val + carry;
            int h = sum%10;
            carry = sum/10;

            ListNode temp1 = new ListNode(h);
            first.next = temp1;
            first = first.next;
            hnode = hnode.next;
       }
       if(carry > 0)
       {
            ListNode temp1 = new ListNode(carry);
            first.next = temp1;
       }
        ListNode ans = Reverse(temp.next);

        return ans;
    }
}