/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        ListNode fast = head;
        ListNode slow = head;
        ListNode ptr = head;

        if(head == null || head.next == null)
        {
            return null;
        }

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
            {
                while(slow != ptr)
                {
                    slow = slow.next;
                    ptr = ptr.next;
                }
                
                return ptr;
            }
        }

        return null;
    }
}