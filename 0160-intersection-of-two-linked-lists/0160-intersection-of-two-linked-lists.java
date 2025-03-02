/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int CountNode(ListNode head)
    {
        int count = 0;
        ListNode ptr3 = head;

        while(ptr3 != null)
        {
            count++;
            ptr3 = ptr3.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA == null || headB == null)
        {
            return null;
        }

        int first = CountNode(headA);
        int second = CountNode(headB);

        int diff = first - second;

        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if(diff > 0)
        {
            while(diff > 0)
            {
                ptr1 = ptr1.next;
                diff--;
            }
        }
        else
        {
            while(diff < 0)
            {
                ptr2 = ptr2.next;
                diff++;
            }
        }

        while(ptr1 != ptr2)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}