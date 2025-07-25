class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
        int i = 0;
        for( i = i+1; i<arr.length; i++)
        {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
            {
                return i;
            }
        }
        return -1;
    }
}