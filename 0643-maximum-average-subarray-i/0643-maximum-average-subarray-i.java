class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int sum = 0, Maxsum = 0;
        int n = nums.length;
        for(int i = 0; i<k; i++)
        {
            sum = sum + nums[i];
        }
        Maxsum = sum;

        int l = 0;
        int r = k;

        while(r < n )
        {
            sum = sum - nums[l];
            l++;
            
            sum = sum + nums[r];
            r++;

            Maxsum = Math.max(sum,Maxsum);

        }
        return (double)Maxsum/k;
    }
}