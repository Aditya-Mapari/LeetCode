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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        if(l1 == null)
        {
            return l2;
        }
        else if(l2 == null)
        {
            return l2;
        }

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode first = new ListNode(-1);
        ListNode temp = first;
        int carry = 0;

        while(ptr1 != null || ptr2 != null)
        {
            int val1 = ptr1!=null ? ptr1.val : 0;
            int val2 = ptr2!=null ? ptr2.val : 0;

            int sum = val1 + val2 + carry;

            int d = sum%10;
            carry = sum/10;

            ListNode temp1 = new ListNode(d);
            first.next = temp1;
            first = first.next;

            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;
        }
        if(carry > 0)
        {
            ListNode temp2 = new ListNode(carry);
            first.next = temp2;
            first = first.next;
        }
        return temp.next;
    }
}