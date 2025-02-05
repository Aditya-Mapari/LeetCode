class Solution {
    public int findPeakElement(int[] nums) 
    {
        if(nums.length == 1)
        {
            return 0;
        }
        else if(nums[0] > nums[1])
        {
            return 0;
        }
        else if(nums[nums.length-1] > nums[nums.length-2])
        {
            return nums.length-1;
        }

        int iStart = 1;
        int iEnd = nums.length-2;

        while(iStart <= iEnd)
        {
            int iMid = (iStart + iEnd)/2;

            if(nums[iMid] > nums[iMid - 1] && nums[iMid] > nums[iMid + 1] )
            {
                return iMid;
            }
            else if(nums[iMid] < nums[iMid + 1])
            {
                iStart = iMid + 1;
            }
            else
            {
                iEnd = iMid - 1;
            }
        }

        return -1;
    }
}