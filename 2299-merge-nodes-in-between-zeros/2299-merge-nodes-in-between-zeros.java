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
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode first = new ListNode(-1);
        ListNode temp = first;
        ListNode ptr = head.next;
        ListNode ptr1 = head;
        int sum = 0;

        while(ptr != null)
        {
            if(ptr.val != 0)
            {
                sum = sum + ptr.val;
            }
            else
            {
                if(sum != 0)
                {
                    ListNode ll = new ListNode(sum);
                    first.next = ll;
                    first = first.next;
                    sum = 0;
                }
            }
            
           
            ptr = ptr.next;
           
        }
        return temp.next;
    }

}