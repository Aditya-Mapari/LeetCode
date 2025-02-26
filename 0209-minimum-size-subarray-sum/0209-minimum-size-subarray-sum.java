class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
       int l = 0, r = 0, n = nums.length, sum = 0, Minlen = Integer.MAX_VALUE;

        

        while(r < n)
        {
            sum = sum + nums[r];

            while(sum >= target)
            {
                Minlen = Math.min(Minlen, r-l+1);
                sum = sum - nums[l];
                l++;
            }

            r++;
        }
        return (Minlen == Integer.MAX_VALUE) ? 0 : Minlen;
    }
}