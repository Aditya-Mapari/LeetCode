class Solution {
    public int dominantIndex(int[] nums) 
    {
        int iMax = -1, iSmax = -1, index = 0;;
       

        for(int i = 0 ; i<nums.length; i++)
        {
            if(nums[i] > iMax)
            {
                iSmax = iMax;
                iMax = nums[i];
                index = i;

            }
            else if(iSmax < nums[i])
            {
                iSmax = nums[i];
            }
        }
        if(iSmax*2 <= iMax)
        {
            return index;
        }
        else
        {
            return -1;
        }

    }
}