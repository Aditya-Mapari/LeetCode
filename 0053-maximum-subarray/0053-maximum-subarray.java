class Solution {
    public int maxSubArray(int[] nums) 
    {
       int sum = 0, MaxSum = Integer.MIN_VALUE;;

       for(int i = 0; i<nums.length; i++)
       {
            sum = nums[i]+ sum;
            MaxSum = Math.max(sum, MaxSum);

            if(sum < 0)
            {
                sum = 0;
            }
            
       }
       return MaxSum;
        

    }
}