class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int iStart = 0;
        int iEnd = nums.length-1;

        while(iStart <= iEnd)
        {
            int iMid = (iStart + iEnd) / 2;

            if(nums[iMid] == target)
            {
                return iMid;
            }
            else if(target > nums[iMid])
            {
                iStart = iMid + 1;
            }
            else
            {
                iEnd = iMid - 1;
            }


        
        }
        return iStart;
    }
}