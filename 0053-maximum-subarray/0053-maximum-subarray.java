class Solution {
    public int maxSubArray(int[] nums) 
    {
        
        int Maxsum = nums[0];
        int sum = nums[0];

        for(int i = 1; i<nums.length; i++)
        {
            sum += nums[i];

            if (sum < nums[i]) {
                sum = nums[i]; // Reset sum to current element if it's larger
            }
            Maxsum = Math.max(Maxsum, sum);
        }
        return Maxsum;

    }
}