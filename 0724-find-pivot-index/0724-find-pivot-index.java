class Solution {
    public int pivotIndex(int[] nums) 
    {
        int rsum = 0;
        for(int ele : nums)
        {
            rsum  = rsum + ele;
        }

        int lsum = 0;
        for(int i = 0; i<nums.length; i++ )
        {
            rsum -= nums[i];

            if(lsum == rsum)
            {
                return i;
            }
            else
            {
                lsum = lsum + nums[i];
            }
        }
        return -1;
    }
}