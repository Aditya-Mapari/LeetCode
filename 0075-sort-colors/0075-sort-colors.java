class Solution {
    public void sortColors(int[] nums) {
        int temp2 = 0;
        
        int temp = 0;
        for(int i = 0; i<nums.length; i++)
        {
             int min = Integer.MAX_VALUE;
            for(int j =i+1; j<nums.length; j++)
            {
                 
                if(nums[j] < min)
                {
                    min = nums[j];
                     temp = j;
                }
            }
           if(nums[i] > min )
           {
                temp2 = nums[i];
                nums[i] = min;
                nums[temp] = temp2;
           }
            
        }
    }
}