class Solution {
    public int search(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {
            int iMid = (start+end)/2;

            if(nums[iMid] == target)
            {
                return iMid;
            }
            else if(nums[start] <= nums[iMid])
            {
                if(target >= nums[start] && target < nums[iMid])
                {
                    end = iMid - 1;

                }
                else 
                {
                    start = iMid + 1;
                }
            }
            else
            {
                if(target > nums[iMid] && target <= nums[end])
                {
                    start = iMid + 1;
                }
                else
                {
                    end = iMid - 1;
                }                           
            }
        }
        return -1;
    }
}