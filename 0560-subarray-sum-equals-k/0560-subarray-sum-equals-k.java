class Solution {
    public int subarraySum(int[] nums, int k) 
    {
  int count = 0, sum = 0;
        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();
        
        // Initialize the map with sum 0 appearing once (base case)
        prefixSumFreq.put(0, 1);

        for (int num : nums) {
            sum += num;  // Compute prefix sum

            // Check if (sum - k) exists in the map
            if (prefixSumFreq.containsKey(sum - k)) {
                count += prefixSumFreq.get(sum - k); // Add its frequency to count
            }

            // Update the prefix sum frequency in the map
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}