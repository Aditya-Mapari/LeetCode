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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode first = new ListNode(-1);
        ListNode temp  = first;

        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.val < ptr2.val)
            {
                temp.next = ptr1;
                ptr1 = ptr1.next;
                
            }
            else
            {
                temp.next = ptr2;
                ptr2 = ptr2.next;
                

            }
            temp = temp.next;
        }
        if(ptr1 == null)
        {
            temp.next = ptr2;
        }
        else
        {
            temp.next = ptr1;
        }

        return first.next;

    }
}