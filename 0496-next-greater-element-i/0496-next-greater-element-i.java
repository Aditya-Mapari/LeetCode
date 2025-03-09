class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int [] arr = new int[nums1.length];
        for(int i = n-1; i>=0; i--)
        {


            while(!st.isEmpty() && st.peek() < nums2[i])
            {
                st.pop();

            }
            if(st.isEmpty())
            {
                hm.put(nums2[i], -1);
                st.push(nums2[i]);
            }
            else
            {
                hm.put(nums2[i] , st.peek());
                st.push(nums2[i]);
            }
           
        }

        for(int i =0; i<nums1.length; i++)
        {
           int no =  hm.get(nums1[i]);
           arr[i] = no;
        }

        return arr;
    }
}