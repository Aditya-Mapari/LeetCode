class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        boolean bRet = false;
        Set<Integer> st = new HashSet<>();

        for(int i= 0; i<nums.length; i++)
        {
            if(st.add(nums[i]))
            {

            }
            else
            {
                return bRet = true;
            }
        }
        return bRet;
    }
}