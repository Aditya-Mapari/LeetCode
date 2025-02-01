class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
       int first = Integer.MAX_VALUE;
       int second = Integer.MAX_VALUE;
       int Third = Integer.MAX_VALUE;

       for(int i = 0; i< nums.length; i++)
       {
            int elem = nums[i];

            if(first >= elem)
            {
                first = elem;
            }
            else if(second >= elem)
            {
                second = elem;
            }
            else
            {
                Third = elem;
                return true;
            }
       }
       return false;
    }
}