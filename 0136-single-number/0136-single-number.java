class Solution {
    public int singleNumber(int[] nums) 
    {
        int XOR = 0;

        for(int i=0; i<nums.length; i++)
        {
            XOR = XOR ^ nums[i];
            System.out.println(XOR);
        }
        return XOR;
    }
}