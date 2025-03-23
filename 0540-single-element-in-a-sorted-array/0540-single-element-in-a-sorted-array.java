class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int max = 0;
         for (int num : nums) {
            max = Math.max(max, num);
        }
        int []arr = new int[max+1];

        for(int i=0; i<nums.length; i++)
        {
            arr[nums[i]]++; 
           
        }
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] == 1)
            {
                return i;
            }
        }

        return 0;
    }
}