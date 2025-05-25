class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int value = 0;
        int n = nums.length;

        for(int i = 0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
               int count = hm.get(nums[i]);
               hm.put(nums[i], count+1);
            }
            else
            {
                hm.put(nums[i], 1);
            }

            if(hm.get(nums[i]) > n/2)
            {
                return nums[i];
            }
        }
        return -1;

       


    }
}