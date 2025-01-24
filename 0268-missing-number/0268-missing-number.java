class Solution {
    public int missingNumber(int[] nums) 
    {
        int iLength = nums.length;
        int iSum = 0, iCount = 0 , iSum1 =0;
        for(int i= 0; i<nums.length; i++)
        {
            iSum = iSum + nums[i];
            iCount++;
        }
        for(int i = 0; i<=iCount; i++)
        {
            iSum1 = iSum1 + i;
        }
        return iSum1 - iSum;

    }
}