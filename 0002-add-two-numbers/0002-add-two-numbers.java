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
          System.out.println("carry is beomming 0 for ptr2.val");
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        ListNode first = new ListNode(-1);
        ListNode temp = first;

        int carry = 0;

        while(ptr1 != null && ptr2 != null)
        {
            int sum = ptr1.val + ptr2.val+ carry;

            if(sum >= 10)
            {
                carry = 1;
                sum = sum - 10;
            }
            else{
                carry=0;
            }

            ListNode temp1 = new ListNode(sum);

            first.next = temp1;


            first = first.next;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if(ptr2 == null && ptr1 != null)
        {

            while(ptr1 != null)
            {
                if(carry > 0)
                {
                 int sum1 = ptr1.val + carry;
                    
                    if(sum1 >=10)
                    {
                        sum1 = sum1 - 10;
                        carry = 1;
                        ListNode temp4 = new ListNode(sum1);
                        first.next = temp4;
                    }
                    else
                    {
                        ListNode temp3 = new ListNode(sum1);
                        first.next = temp3;
                        carry=0;
                    }
                    
                    
                }
                else
                {
                    ListNode temp2 = new ListNode(ptr1.val);
                    first.next = temp2;
                }
                ptr1 = ptr1.next;
                first = first.next;
                
            }
        }
        else if(ptr1 == null && ptr2 != null)
        {
            while(ptr2 != null)
            {
                if(carry > 0)
                {
                    // System.out.println("carry is greater  0 for ptr2.val"+ptr2.val);
                    int sum1 = ptr2.val + carry;
                    
                    if(sum1 >=10)
                    {
                            //   System.out.println("carry is beomming again 1 for ptr2.val"+ptr2.val);
                        sum1 = sum1 - 10;
                        carry = 1;
                        ListNode temp4 = new ListNode(sum1);
                        first.next = temp4;
                    }
                    else
                    {
                            //   System.out.println("carry is beomming 0 for ptr2.val"+ptr2.val);
                       ListNode temp3 = new ListNode(sum1); 
                       first.next = temp3;
                        carry=0;
                    }
                    
                    
                }
                else
                {
                    // System.out.println("carry is beomming 0 for ptr2.val"+ptr2.val);
                    ListNode temp2 = new ListNode(ptr2.val);
                    first.next = temp2;
                }
                ptr2 = ptr2.next;
                first =first.next;
            }
        }
        if(ptr1 == null && ptr2 == null && carry >= 1)
        {
          
            ListNode temp5 = new ListNode(1);
            first.next = temp5;
        }
        
        return temp.next;
    }
}