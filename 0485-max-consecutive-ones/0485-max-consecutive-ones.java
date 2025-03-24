class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
       int r = 0, l = 0, count = 0, Maxcount= 0;
        
        while(r < nums.length)
        {
            if(nums[r] == 1)
            {
                count++;
                Maxcount = Math.max(count, Maxcount);
            }
            else if(nums[r] != 1)
            {
                count  = 0;
            }
            r++;
        }
        return Maxcount;
    }
}