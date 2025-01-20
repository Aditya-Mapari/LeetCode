class Solution {
    public int findDuplicate(int[] nums) 
    {
        int req = 0;
        int[] arr = new int[nums.length];

       for(int i = 0; i<nums.length; i++)
       {
           arr[nums[i]]++;
           if(arr[nums[i]]>1)
           {
                return nums[i];
           }
       }
       return -1;

       
    }
}