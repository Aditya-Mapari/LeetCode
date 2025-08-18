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
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode first = headA;
        ListNode second = headB;
        int count1 = 0;
        int count2 = 0;
        
        while(first != null)
        {
            count1++;
            first = first.next;
        }
        while(second != null)
        {
            count2++;
            second = second.next;
        }
        first = headA;
        second = headB;
        
        if(count1 > count2)
        {
            int step = count1 - count2;
            
            for(int i = 0; i < step; i++)
            {
                first = first.next;
            }
        }
        else
        {
            int step = count2 - count1;
            
            for(int i = 0; i < step; i++)
            {
                second = second.next;
            }
        }
        
        while(first != null && second != null)
        {
            if(first == second)
            {
                return first;
            }
            first = first.next;
            second = second.next;
        }
        return null;
    }
}