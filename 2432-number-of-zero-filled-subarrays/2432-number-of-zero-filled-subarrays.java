class Solution {
    public long zeroFilledSubarray(int[] nums) {
      
        long result = 0;
    int n = nums.length;

    int i = 0;
    while (i < n) {
        long l = 0;
        // count consecutive zeros starting at i
        while (i < n && nums[i] == 0) {
            l++;
            i++;
        }
        // add subarrays from this streak
        result += (l * (l + 1)) / 2;

        // move to next element (if not already incremented)
        i++;
    }
    return result;
       
    }
}