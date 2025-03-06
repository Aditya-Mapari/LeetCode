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
    public ListNode deleteMiddle(ListNode head) 
    {
        int count = 0;
        ListNode ptr1 = head;

        while(ptr1 != null)
        {
            count++;
            ptr1 = ptr1.next;
        }
        if(count == 1)
        {
            return null;
        }
        int mid = count/2;
        ListNode temp = head;
        for(int i = 0; i<mid-1; i++)
        {
           temp = temp.next;
        }
        if(temp.next != null)
        {
            temp.next = temp.next.next;
        }
       

        return head;
    }
}