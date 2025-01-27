class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1}; 

       
        if (nums.length == 0) {
            return arr;
        }

        arr[0] = firstOccurrence(nums, target); 
        arr[1] = lastOccurrence(nums, target); 

        return arr;
    }

    public int firstOccurrence(int[] nums, int target) {
        int iStart = 0;
        int iEnd = nums.length - 1;
        int iAns = -1; 

        while (iStart <= iEnd) {
            int iMid = (iStart + iEnd) / 2;

            if (nums[iMid] == target) {
                iAns = iMid; 
                iEnd = iMid - 1; 
            } else if (target > nums[iMid]) {
                iStart = iMid + 1; 
            } else {
                iEnd = iMid - 1; 
            }
        }

        return iAns;
    }

    public int lastOccurrence(int[] nums, int target) {
        int iStart = 0;
        int iEnd = nums.length - 1;
        int iAns = -1; 

        while (iStart <= iEnd) {
            int iMid = (iStart + iEnd) / 2;

            if (nums[iMid] == target) {
                iAns = iMid; 
                iStart = iMid + 1; 
            } else if (target > nums[iMid]) {
                iStart = iMid + 1; 
            } else {
                iEnd = iMid - 1; 
            }
        }

        return iAns;
    }
}
