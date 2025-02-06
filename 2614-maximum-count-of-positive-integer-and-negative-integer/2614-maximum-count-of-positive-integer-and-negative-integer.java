class Solution {
    public int maximumCount(int[] nums) 
    {
       int lastnegIndex =  Lastnegative(nums) + 1;
       int firstposIndex = nums.length - FirstPositive(nums);

        return  Math.max(lastnegIndex , firstposIndex);

    }
    public int Lastnegative(int []nums)
    {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end)
        {
            
            int iMid = (start + end)/2;

            if(nums[iMid] < 0)
            {
                ans =iMid;
                start = iMid + 1;
            }
            else
            {
                end = iMid - 1;
            }
        }
        return ans;
    }

    public int FirstPositive(int []nums)
    {
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;

        while(start <= end)
        {
            
            int iMid = (start + end)/2;

            if(nums[iMid] > 0)
            {
                ans =iMid;
                end = iMid - 1;
            }
            else
            {
                start = iMid +1;
            }
        }
        return ans;
    }
}