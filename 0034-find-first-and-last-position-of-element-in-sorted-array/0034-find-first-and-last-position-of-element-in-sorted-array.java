class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1}; 
        if(nums.length == 0)
        {
            return arr;
        }

        arr[0] = firstOccurence(nums, target);
        arr[1] = lastOccurence(nums, target);

        return arr;
    }

    public int firstOccurence(int[] nums, int target)
    {
        int ans = -1;
        int iStart = 0;
        int iEnd = nums.length-1;


        while(iStart <= iEnd)
        {
            int iMid = (iStart + iEnd) / 2;

            if(nums[iMid] == target)
            {
                ans = iMid;
                iEnd = iMid - 1;
            }
            else if (target > nums[iMid])
            {
                iStart = iMid + 1;
            }
            else
            {
                iEnd = iMid - 1;
            }
           
        }
        return ans;

    }

    public int lastOccurence(int[] nums, int target)
    {
        int ans = -1;
        int iStart = 0;
        int iEnd = nums.length-1;


        while(iStart <= iEnd)
        {
            int iMid = (iStart + iEnd) / 2;

            if(nums[iMid] == target)
            {
                ans = iMid;
                iStart = iMid + 1;
            }
            else if (target > nums[iMid])
            {
                iStart = iMid + 1;
            }
            else
            {
                iEnd = iMid - 1;
            }

        }
        return ans;

    }

       
        
}
