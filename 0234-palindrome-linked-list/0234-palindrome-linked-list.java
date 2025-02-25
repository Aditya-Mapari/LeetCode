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
    public boolean isPalindrome(ListNode head) 
    {
        StringBuilder s=new StringBuilder("");

        ListNode temp = head;
        while(temp != null)
        {
          
            s.append(Integer.toString(temp.val));
            temp = temp.next;
        }
            System.out.println(s.toString());
        if(s.toString().equals(s.reverse().toString()))
        {
        return true;
        }
        return false;
    }
}