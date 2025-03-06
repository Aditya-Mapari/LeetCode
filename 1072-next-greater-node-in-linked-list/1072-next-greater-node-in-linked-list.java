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
    public int[] nextLargerNodes(ListNode head) 
    { 
        ArrayList<Integer> al = new ArrayList<>();
       ListNode temp = head.next;;

        while(head != null)
        {
            int data = head.val;
            temp = head.next;
            Boolean found=false;
            while(temp != null)
            {found=false;
                if(temp.val > data)
                {
                    al.add(temp.val);
                    found=true;
                    break;
                }
                temp=temp.next;
                
            }
            if(!found){
            al.add(0);

            }
            head = head.next;
        }

        int []arr = new int[al.size()];

        for(int i =0; i<al.size(); i++)
        {
            arr[i] = al.get(i);
        }
        return arr;
    }
}