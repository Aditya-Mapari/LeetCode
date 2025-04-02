class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int []arr = {-1, -1};

        if(nums.length == 0)
        {
            return arr;
        }

        int start = 0, end = nums.length-1;

        //first occurence
        while(start <= end)
        {
            int mid = (start + end)/2;

            if(nums[mid] == target)
            {
                arr[0] = mid;
                end = mid-1;
            }

           else if(nums[mid] > target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }

        // last occurence
        start = 0; end = nums.length-1;
        while(start <= end)
        {
            int mid = (start + end)/2;

            if(nums[mid] == target)
            {
                arr[1] = mid;
                start = mid+1;
            }
           else if(nums[mid] > target)
            {
                end = mid - 1;
            }

            else
            {
                start = mid + 1;
            }
        }

        return arr;
    }

       
        
}
