class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int imax = 0;
        int icnt = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                icnt++;
            }
            else
            {
                icnt = 0;
            }

            imax = Math.max(icnt, imax);
        }
        return imax;
    }
}