class Solution {
    public boolean divideArray(int[] nums) 
    {
       HashMap<Integer, Integer> hm = new HashMap<>();

       for(int i = 0; i<nums.length; i++)
       {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i], 1);

            }
            else
            {
               hm.put(nums[i], hm.get(nums[i]) + 1);

            }
       }
       for(int n : hm.values())
       {
            
            if(n % 2 != 0)
            {
                System.out.println(n);
                return false;
            }
       }
       return true;
    }
}