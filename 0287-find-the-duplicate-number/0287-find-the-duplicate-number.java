class Solution {
    public int findDuplicate(int[] nums) 
    {
        int element = 0;
        for(int i =0; i<nums.length; i++)
        {
           element = nums[i];
            element = Math.abs(element);


            if(nums[element] > 0)
            {
                nums[element] = -nums[element];
            }
        else
            {
                return element;
                
            }
        }
       
        return -1;
       
    }
}