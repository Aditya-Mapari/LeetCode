class Solution {
    public int findMin(int[] nums) 
    {
        if(nums.length == 1)
        {
            return nums[0];
        }

         int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // Minimum must be in the right part
                start = mid + 1;
            } else {
                // Minimum could be mid or in the left part
                end = mid;
            }
        }

        return nums[start];

        
    }
}