class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
           int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0, negIndex = 1;
        
        // Fill the result array by placing positives at even indices and negatives at odd indices
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }
        
        return result;
    }
}