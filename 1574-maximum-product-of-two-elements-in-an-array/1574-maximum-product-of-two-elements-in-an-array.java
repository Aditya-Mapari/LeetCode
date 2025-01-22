class Solution {
    public int maxProduct(int[] nums) 
    {
        int iFirst = 0, iSec = 0, i = 0;
        iFirst = nums[i];
        for(i=1 ; i<nums.length; i++)
        {
           
            if(nums[i]>= iFirst)
            {
                iSec = iFirst;
                iFirst = nums[i];
            }
            else if(nums[i] > iSec)
            {
                iSec = nums[i];
            }
        }
        iFirst--;
        iSec--;

        return iFirst*iSec;
    }
}