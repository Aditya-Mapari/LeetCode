class Solution {
    public int maxAscendingSum(int[] nums) 
    {
        int Cursum = nums[0] , Maxsum = nums[0];

        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i-1] < nums[i])
            {
                Cursum = Cursum + nums[i];
            }
            else
            {
                Maxsum = Math.max(Cursum, Maxsum);
                Cursum = nums[i];
            }
        }
        Maxsum = Math.max(Cursum, Maxsum);

        return Maxsum;
    }
}