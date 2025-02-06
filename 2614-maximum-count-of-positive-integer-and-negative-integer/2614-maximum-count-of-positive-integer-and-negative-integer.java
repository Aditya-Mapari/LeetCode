class Solution {
    public int maximumCount(int[] nums) 
    {
       
        int ipos = 0;
        int ineg= 0;
        int iRet = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] !=0)
            {
                if(nums[i] < 0)
                {
                    ineg++;
                }
                else if(nums[i] > 0)
                {
                    ipos++;
                }
            }
           
        }
        iRet =  iMax(ipos, ineg);
        return iRet;

    }

     int iMax(int a , int b)
        {
            int iMax = 0;
            if(a < 0)
            {
                a = a*-1;

            }
             if( b < 0)
            {
                b = b*-1;
            }
            else if(a >= b)
            {
                iMax = a;
            }
            else
            {
                iMax = b;
            }
           return iMax;
        }
}